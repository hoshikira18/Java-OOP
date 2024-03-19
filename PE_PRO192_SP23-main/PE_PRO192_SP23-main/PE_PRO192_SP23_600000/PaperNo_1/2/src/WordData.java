/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class WordData extends Factory implements IConnect {

    private String content;

    public WordData(String type, String dataSource) {
        super(type, dataSource);
        this.content = "this is a string";
    }

    @Override
    public void readData() {
        if (super.getType().endsWith(".doc")) {
            this.content = "humpty dumpty sat on the wall";
        }
    }

    @Override
    public String writeData() {
        String result = "";
        String[] subStrings = content.split(" ");

        for (int i = 0; i < subStrings.length; i++) {
            subStrings[i] = subStrings[i].substring(0, 1).toUpperCase() + subStrings[i].substring(1);
            if(i == 0) {
                result += subStrings[i];
            }
            else {
                result = result + " " + subStrings[i];
            }
        }

        return result;
    }

    @Override
    public boolean makeConnection() {
        if (super.getDataSource().contains("localhost:8080")) {
            return true;
        }
        return false;
    }

}
