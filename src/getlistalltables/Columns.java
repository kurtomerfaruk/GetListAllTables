/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getlistalltables;

/**
 *
 * @author Omer Faruk KURT
 */
public class Columns {

    private String columnName;
    private String columnType;
    private int columnSize;
    private String table;

    public Columns() {
    }

    public Columns(String columnName, String columnType, int columnSize, String table) {
        this.columnName = columnName;
        this.columnType = columnType;
        this.columnSize = columnSize;
        this.table = table;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

}
