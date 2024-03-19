/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class SpecLift extends Lift {
    private int load;

    public SpecLift() {
    }

    public SpecLift(int load) {
        this.load = load;
    }

    public SpecLift(String label, int type,int load) {
        super(label, type);
        this.load = load;
    }

    @Override
    public String toString() {
        return getLabel() + "," + load + "," + getType();
    }
    
    public void setData() {
        
        setLabel(getLabel().replace("[13579]", ""));
//        String[] s = super.getLabel().split("");
//        String result = "";
//        for (int i = 0; i < s.length; i++) {
//            if(i % 2 == 0) {
//                result+=s[i];
//            }
//       
        
//        super.setLabel();
    }
    
    public int getValue() {
        if(super.getLabel().contains(super.getType()+"")) {
            return this.load + super.getType();
        }
        return this.load;
    }
}
