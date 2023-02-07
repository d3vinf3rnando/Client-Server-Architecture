package com.sampleproject;
import java.util.Date;
public class SimpleTest {


    DummyServer  server = new DummyServer();

     public String serverName="Server ";
    Date dateNew = new Date();


    public static void main(String[]args){
        SimpleTest client = new SimpleTest();
        client.execute();
    }


  /**Execute the client functionality **/
    private void execute(){
        System.out.println(dateNew.toString()+ serverName+ server.Getconnection());
    }
}
