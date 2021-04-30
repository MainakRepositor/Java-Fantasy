import java.sql.Timestamp;    
import java.util.Date;    
class TimestampToDateExample1 {    
       public static void main(String args[]){    
                Timestamp ts=new Timestamp(System.currentTimeMillis());  
                Date date=new Date(ts.getTime());  
                System.out.println(date);                     
        }    
}    