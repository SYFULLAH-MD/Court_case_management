import java.util.Scanner;
import java.io.*;
class Pat extends Nit
{
    int select;
    Pat()
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select your type of case");
        System.out.println("1.theft");
        System.out.println("2.murder");
        System.out.println("3.divorce cases");
        System.out.println("4.Scams");
        int choice=sc.nextInt();
        System.out.println("select your case");
        int[] a=new int[10];
        int count=0,x=0;
        switch(choice)
        {
            case 1:for(int i=1;i<=8;i++)
                   {
                       if(d[i].branch=="theft")
                       {
                           System.out.print((count+1)+")");
                           count++;
                           System.out.print(d[i].name+" ");
                           System.out.print(d[i].clientid+" ");
                           System.out.print(d[i].qual+" ");
                           System.out.println(d[i].phn+" ");
                           a[x++]=i;
                       }
                   }
                   System.out.println("select the lawyer");
                   select=sc.nextInt();
                   System.out.println("timings of the lawyer"+d[a[select-1]].time);
                   String ilo=d[a[select-1]].name;
                   ilo=ilo+".txt";
                   System.out.println("enter details for appointment");
                   System.out.println("enter name");
                   String prob=new String();
                   String name1=new String();
                   prob=sc.nextLine();
                   try
                   {
                   name1=br.readLine();
                   System.out.print("enter problem");                 
                   prob=br.readLine();
                   }
                   catch(Exception e)
                   {
                       System.out.println(e);
                   }
                 
                   System.out.println("enter age");
                   int age=sc.nextInt();
                   System.out.println("enter phone number");
                   String phn1=sc.next();
                   
               try
               {
                 FileWriter w=new FileWriter(ilo,true);
                 name1="NAME:"+name1;
                 w.write(name1+"   ");
                 w.write("AGE:"+age+"   ");
                 w.write("PHONE:"+phn1+"   ");                  
                 w.write("PROBLEM:"+"("+prob+")");
                 w.write(System.getProperty("line.separator"));
                 w.close();
                 System.out.println("appointment applied"); 
                }
               catch(Exception e)
               {
                System.out.println("not applied"); 
               }
                   break;
            case 2:for(int i=1;i<=8;i++)
                   {
                       if(d[i].branch=="murder")
                       {
                           System.out.print((count+1)+")");
                           count++;
                           System.out.print(d[i].name+" ");
                           System.out.print(d[i].clientid+" ");
                           System.out.print(d[i].qual+" ");
                           System.out.println(d[i].phn+" ");
                           a[x++]=i;
                       }
                   }
                   System.out.println("select the lawyer");
                   select=sc.nextInt();
                   System.out.println("timings of the lawyer"+d[a[select-1]].time);
                   ilo=d[a[select-1]].name;
                   ilo=ilo+".txt";
                   System.out.println("enter details for appointment");
                   name1="";prob="";
                   try
                   {
                    System.out.println("enter your name");
                    name1=br.readLine();
                    System.out.print("enter problem");                 
                    prob=br.readLine();
                   
                   }
                   catch(Exception e)
                   {
                       System.out.println(e);
                    }
                   System.out.println("enter age");
                   age=sc.nextInt();
                   System.out.println("enter phone number");
                   phn1=sc.next();
               try
               {
                 FileWriter w=new FileWriter(ilo,true);
                 name1="NAME:"+name1;
                 w.write(name1+"   ");
                 w.write("AGE:"+age+"   ");
                 w.write("PHONE:"+phn1+"   ");                  
                 w.write("PROBLEM:"+"("+prob+")");
                 w.write(System.getProperty("line.separator"));
                 w.close();
                 System.out.println("appointment applied"); 
                }
               catch(Exception e)
               {
                
                System.out.println("not applied"); 
               }
                   break;
            case 3:for(int i=1;i<=8;i++)
                   {
                       if(d[i].branch=="divorce")
                       {
                           System.out.print((count+1)+")");
                           count++;
                           System.out.print(d[i].name+" ");
                           System.out.print(d[i].clientid+" ");
                           System.out.print(d[i].qual+" ");
                           System.out.println(d[i].phn+" ");
                           a[x++]=i;
                       }
                   }
                   System.out.println("select the lawyer");
                   select=sc.nextInt();
                   System.out.println("timings of the lawyer"+d[a[select-1]].time);
                   ilo=d[a[select-1]].name;
                   ilo=ilo+".txt";
                
		  System.out.println("enter details for appointment");
                   name1="";prob="";
                   try
                   {
                   System.out.println("enter your name");
                   name1=br.readLine();
                   System.out.print("enter problem");                 
                   prob=br.readLine();
                   
                   }
                   catch(Exception e)
                   {
                       System.out.println(e);
                   }
                   System.out.println("enter age");
                   age=sc.nextInt();
                   System.out.println("enter phone number");
                   phn1=sc.next();
               try
               {
                 FileWriter w=new FileWriter(ilo,true);
                 name1="NAME:"+name1;
                 w.write(name1+"   ");
                 w.write("AGE:"+age+"   ");
                 w.write("PHONE:"+phn1+"   ");                  
                 w.write("PROBLEM:"+"("+prob+")");
                 w.write(System.getProperty("line.separator"));
                 w.close();
                 System.out.println("appointment applied"); 
                }
               catch(Exception e)
               {
                System.out.println("please try again");
                 
               }
                   break;
            case 4:for(int i=1;i<=8;i++)
                   {
                       if(d[i].branch=="scams")
                       {
                           System.out.print((count+1)+")");
                           count++;
                           System.out.print(d[i].name+" ");
                           System.out.print(d[i].clientid+" ");
                           System.out.print(d[i].qual+" ");
                           System.out.println(d[i].phn+" ");
                           a[x++]=i;
                       }
                   }
                   System.out.println("select the lawyer");
                   select=sc.nextInt();
                   System.out.println("timings of the lawyer"+d[a[select-1]].time);
                   ilo=d[a[select-1]].name;
                   ilo=ilo+".txt";
                   
                   System.out.println("enter details for appointment");
                   name1="";prob="";
                   try
                   {
                   System.out.println("enter your name");
                   name1=br.readLine();
                   System.out.print("enter problem");                 
                   prob=br.readLine();
                   
                   }
                   catch(Exception e)
                   {
                       System.out.println(e);
                    }
                   System.out.println("enter age");
                   age=sc.nextInt();
                   System.out.println("enter phone number");
                   phn1=sc.next();
               try
               {
                 FileWriter w=new FileWriter(ilo,true);
                 name1="NAME:"+name1;
                 w.write(name1+"   ");
                 w.write("AGE:"+age+"   ");
                 w.write("PHONE:"+phn1+"   ");                  
                 w.write("PROBLEM:"+"("+prob+")");
                 w.write(System.getProperty("line.separator"));
                 w.close();
                 System.out.println("appointment applied"); 
                }
               catch(Exception e)
               {
                
                System.out.println("please try again"); 
               }
                   break;
        }
        for(int i=0;i<10;i++)
        {
            a[i]=0;
        }
    }
}
class Doc
{
    String name;
    String clientid;
    String qual;
    String phn;
    String branch;
    String time;
    Doc[] d=new Doc[30];
    Doc()
    {   
    }
    }
class Nit extends Doc
{
    Nit()
    {
        d[1]=new Doc();
        d[2]=new Doc();d[3]=new Doc();d[4]=new Doc();d[5]=new Doc();d[6]=new Doc();d[7]=new Doc();d[8]=new Doc();
        d[1].name="p.siddardha";
        d[1].clientid="123";
        d[1].qual="llb";
        d[1].phn="9701122517";
        d[1].branch="theft";
        d[1].time="10am to 5pm";
        d[2].name="b.vinoothna";
        d[2].clientid="124";
        d[2].qual="llb";
        d[2].phn="8333824902";
        d[2].branch="theft";
        d[2].time="11am to 5pm";
        
        d[3].name="s.reetesh";
        d[3].clientid="121";
        d[3].qual="llb";
        d[3].phn="9441589608";
        d[3].branch="murder";  
        d[3].time="1pm to 5pm";
        d[4].name="k.gopi";
        d[4].clientid="126";
        d[4].qual="llb";
        d[4].phn="9848689058";
        d[4].branch="murder";
        d[4].time="10am to 5pm";
        
        d[5].name="d.pavan";
        d[5].clientid="127";
        d[5].qual="llb";
        d[5].phn="9701122517";
        d[5].branch="divorce";
        d[5].time="11am to 5pm";
        d[6].name="A.jithendra";
        d[6].clientid="129";
        d[6].qual="llb";
        d[6].phn="8333836103";
        d[6].branch="divorce";
        d[6].time="3pm to 5pm";
        
        d[7].name="a.ritwik";
        d[7].clientid="130";
        d[7].qual="llb";
        d[7].phn="7013099639";
        d[7].branch="scam";
        d[7].time="10am to 5pm";
        d[8].name="s.reetesh";
        d[8].clientid="131";
        d[8].qual="llb";
        d[8].phn="9701122517";
        d[8].branch="scams";
        d[8].time="8am to 5pm";
    }
}
class Cou
{
    Cou()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("hello lawyer!!");
        System.out.println("please enter your name in upper case");
        String l=sc.nextLine();
        l=l+".txt";
        System.out.println(l);
        System.out.println("enter the lawyers access password");
        
        String pass=sc.next();
        if(pass.equals("siddhartha"))
        {
            System.out.println("select option");
            System.out.println("1.getdetails of clients");
            System.out.println("2.logout");
            int opt=sc.nextInt();
            if(opt==1)
            {
                try (BufferedReader br = new BufferedReader(new FileReader(l)))
               {
                String line = null;
                while ((line = br.readLine()) != null)
                {
                   System.out.println(line);
                }
               } 
               catch(Exception e)
               {
                   System.out.println("logout");
                   
               }
              System.out.println("exit");
            }
            }
            
    }
}
public class Javapro
{
    int n;
    Javapro()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("who are you?");
        System.out.println("1.client");
        System.out.println("2.lawyer");
        n=sc.nextInt();
        if(n==1)
        {
            Pat p=new Pat();
        }
        else
        {
            Cou d=new Cou();
        }
    }
    public static void main(String args[])
    {
        Nit n=new Nit();
        Javapro j=new Javapro();
    }
}


