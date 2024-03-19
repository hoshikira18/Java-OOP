/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public abstract class Factory {
    private String type;
    private String dataSource;
    
    public Factory () {
        
    }
    
    public Factory (String type, String dataSource) {
        this.type = type;
        this.dataSource = dataSource;
    }

    public String getType() {
        return type;
    }

    public String getDataSource() {
        return dataSource;
    }
    
    public abstract void readData();
    
    public abstract String writeData();
    
}
