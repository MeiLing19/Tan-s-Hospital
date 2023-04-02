/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Coba;

/**
 *
 * @author Lanyta Setyani Gunawan
 */
public class Loading {
    public static void main(String[] args){
        Home home=new Home();
          loadingjf s=new loadingjf();
          s.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                 s.loadingnum.setText(Integer.toString(i)+"%");
                s.loadingbar.setValue(i);
               
                if(i==100){
               home.setVisible(true);
               s.dispose();
                }
                   
                }
        }
        catch(Exception e){
        }
    }
}
