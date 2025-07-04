package org.example.loader.csv;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CSVLoader extends CSVBaseListener {

    public static final String EMPTY = "";
    /**
     * Load a list of row maps that map field name to value
     */
    List<Map<String, String>> rows = new ArrayList<Map<String, String>>();
    /**
     * List of column names
     */
    List<String> header;
    /**
     * Build up a list of fields in current row
     */
    List<String> currentRowFieldValues;


    @Override
    public void exitString(CSVParser.StringContext ctx) {
        currentRowFieldValues.add(ctx.STRING().getText());
    }


    @Override
    public void exitText(CSVParser.TextContext ctx) {
        currentRowFieldValues.add(ctx.TEXT().getText());
    }

    @Override
    public void exitEmpty(CSVParser.EmptyContext ctx) {
        currentRowFieldValues.add(EMPTY);
    }


    @Override
    public void exitHeader(CSVParser.HeaderContext ctx) {
        header = new ArrayList<String>();
 	    header.addAll(currentRowFieldValues);
    }

    @Override
    public void enterRow(CSVParser.RowContext ctx) {
        currentRowFieldValues = new ArrayList<String>();
    }

    @Override
    public void exitRow(CSVParser.RowContext ctx) {
        // If this is the header row, do nothing
 	    // if ( ctx.parent instanceof CSVParser.HdrContext ) return; OR:
 	    if ( ctx.getParent().getRuleIndex() == CSVParser.RULE_header ) return;
 	    // It's a data row
 	    Map<String, String> m = new LinkedHashMap<String, String>();
 	    int i = 0;
 	    for (String v : currentRowFieldValues) {
 	        m.put(header.get(i), v);
 	        i++;
 	    }
 	    rows.add(m);
    }
}
