
import objsets._

object sheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 

  val set1 = new Empty;System.out.println("""set1  : objsets.Empty = """ + $show(set1 ));$skip(52); 
  val set2 = set1.incl(new Tweet("a", "a body", 2));System.out.println("""set2  : objsets.TweetSet = """ + $show(set2 ));$skip(52); 
  val set3 = set2.incl(new Tweet("b", "b body", 3));System.out.println("""set3  : objsets.TweetSet = """ + $show(set3 ));$skip(52); 
  val set4 = set3.incl(new Tweet("c", "c body", 4));System.out.println("""set4  : objsets.TweetSet = """ + $show(set4 ));$skip(52); 
  val set5 = set4.incl(new Tweet("d", "d body", 5));System.out.println("""set5  : objsets.TweetSet = """ + $show(set5 ));$skip(66); 
  val set9 = set5.incl(new Tweet("e", "e body long to right", 9));System.out.println("""set9  : objsets.TweetSet = """ + $show(set9 ))}
 

 

}
