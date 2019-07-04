/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corre_bglr;

import java.io.IOException;

/**
 *
 * @author FRHUERTA
 */
public class CORRE_BGLR {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String version = System.getProperty("sun.arch.data.model");
        String r_home = "C:\\BASE\\R-3.3.1\\";
        String jri_path;
        String r_path;
        if("64".equals(version)){    
            jri_path = "C:\\BASE\\win-library\\3.3\\rJava\\jri\\x64\\";
            r_path = "C:\\BASE\\R-3.3.1\\bin\\x64\\";
        }else{
            jri_path = "C:\\BASE\\win-library\\3.3\\rJava\\jri\\i386\\";
            r_path = "C:\\BASE\\R-3.3.1\\bin\\i386\\";
        }
        // create the process builder
        ProcessBuilder pb = new ProcessBuilder(); 
        pb.environment().put("R_HOME", r_home);
        pb.environment().put("Path", jri_path + ";" + r_path );
        pb.command("C:\\BGLR\\BGLR.exe");
        pb.start();
    }    
}
