//program to read and write a file student.txt and find out the admission number of a particular student
import java.io.*;//all classes of java input output package are imported into the program
class student_files
  {//class declared
    static String file="STUDENT.txt";//file name assigned
    public static void fileWrite()throws IOException
    {//Writes content onto the file
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter outFile=new PrintWriter(bw);//objects of necessary classes created
        for(int i=0;i<5;i++)
        {  //loop to accept name and admission numbers of 5 students
           System.out.println("Enter name");
           String name=br.readLine();
           System.out.println("Enter admission number");
           int admn=Integer.parseInt(br.readLine());
           outFile.println(name);
           outFile.println(admn);
        }
        outFile.close();
        bw.close();
        fw.close();
    }//writing to file has been completed
    public static void fileRead()throws IOException
    {//reads file contents and searches for admission number of a particular student
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileReader f=new FileReader(file);
        BufferedReader brd=new BufferedReader(f);//objects of classes created
        String text,st;
        int ad;//variables declared
        System.out.println("Enter name to be searched:");
        st=br.readLine();//search term stored in 'st'
        for(int i=0;i<5;i++)
        {//loop to search for particular name
           text=brd.readLine();
           ad=Integer.parseInt(brd.readLine());
           if(st.equalsIgnoreCase(text)==true)
           {//if the name is found
             System.out.println("Name : "+text);
             System.out.println("Admission number : "+ad);
           }
        }
        brd.close();
    }
}//end of class
public class File
{   //public class declared
    public static void main()throws IOException
    {   //main method declared and exception handler assigned to it
        student_files o=new student_files();
        o.fileWrite();
        o.fileRead();//object created and functions invoked
    }//end of main
}//end of class