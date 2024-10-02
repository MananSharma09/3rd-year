/*Q) What is file handling ? Full Explanation
-> file handling defines how we can read and write data on a file.
-> JAVA IO Package contains all the classes through which we can perform all input and output operations in the file.


Stream -> sequence of data.
              -> On the basis of java.io.package all the classes are divided into 2 streams

1) Byte Stream
2) Character Stream

File Handling Methods:-
1) canRead() -> return true/ false basically boolean value milegi -> if it can read file return true otherwise false
2) canWrite() -> returns a boolean value -> True if able to write in a file otherwise false.
3) createNewFile() -> using this we can create a new fresh file
4) Delete() -> we delete a file
5) Exists() -> this will tell you if a file with the name you are using exists or not.
6) length() -> kisi bhi file ki length pta kr skte ho
7) getName() -> this will give u file name.
8) getAbsolutePath() -> this will tell you where your file is created
9) mkdir() -> kisi bhi directory ko create kr skte ho
10) List() -> list all items present in a directory
11) Read() -> file mai data read krne k
12) write() -> file mai write krne k kaam ata hai
13) renameTo() -> file ko rename krne k kaaam ata hai  

File handling classes
1) File -> super class of every file classes
2) FileReader -> use to read data from a file
3) FileWriter -> write data in a file
4) FileInputStream =>  data -> read -> byte ki form mai
5) File OutputStream => data -> write -> byte ki form mai
6) Buffered Input Stream -> file ko read krne k kaam ata hai -> buffer ki form
7) Buffered Output Stream -> file ko write kr skte ho -> buffer ki form mai


Operations  of file:-
1). create a file
2) get file information
3) read
4) write */

import java.io.*;
public class filesystem {
    public static void main(String[] args)throws IOException{
        //! creating
        // File f=new File("/Users/manan/Projects/5sem/FileHandling/Hello.txt");
        //     if(f.createNewFile()){
        //         System.out.println("File created successfully");
        //     }
        //     if(f.exists())
        //     {
        //         System.out.println("File Name : "+f.getName());
        //         System.out.println("File Locations : "+f.getAbsolutePath());
        //         System.out.println("File writable : "+f.canWrite());
        //         System.out.println("File readable : "+f.canRead());
        //         System.out.println("File length : "+f.length());
        //         System.out.println("File Removed : "+f.delete());

        //     }
        //     else
        //     {
        //         System.out.println("File already exists");
        //     }
        //! writing
        // try{
        //     FileWriter f=new FileWriter("/Users/manan/Projects/5sem/FileHandling/Hello.txt");
        //     try{
        //         f.write("This is sample text");
        //     }
        //     finally
        //     {
        //         f.close();
        //     }
        // }
        // catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
        //! Reading
    //     try{
    //         FileReader f = new FileReader("/Users/manan/Projects/5sem/FileHandling/Hello.txt"); 
    //         int i;
    //         try{
    //             while((i=f.read())!= -1)
    //             {
    //                 System.out.print((char)i);
    //             }
    //         }
    //         finally{
    //             f.close();
    //         }
            
    //     }
    //     catch(IOException e)
    //     {
    //         System.out.println(e.getMessage());
    //     }
    //! Renaming
        // File f=new File("/Users/manan/Projects/5sem/FileHandling/Hello.txt");
        // File r =new File("/Users/manan/Projects/5sem/FileHandling/Bye.txt");
        // if(f.exists())
        // {
        //     System.out.println(f.renameTo(r));
        // }
        // else
        // {
        //     System.out.println("File does not exists");
        // }
    //! copying data from one file to another
        FileInputStream r =new FileInputStream("/Users/manan/Projects/5sem/FileHandling/Bye.txt");
        FileOutputStream w =new FileOutputStream("/Users/manan/Projects/5sem/FileHandling/Hello.txt");
        int i;
        while((i=r.read()) != -1)
        {
            w.write((char)i);
        }
        System.out.println("Data Copied Successfully");
        r.close();
        w.close();
    }
}

