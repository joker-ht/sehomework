import java.util.Arrays;
/**类名_方法名(_形参类型_形参类型)
   *@author: MF1933016+dingzhu
   *@className: Arrays_copyOfRange_int_int
   *@apiSignature: java.lang. Arrays$public static int[] copyOfRange (int[] original, int from, int to)
   *@description: Test java api java.lang.int[] copyOfRange (int[] original, int from, int to)
   *@Map: swift api Arrays$func prefix(upTo end: Int);func suffix(_ maxLength: Int);convenience init(array: [Any], copyItems flag: Bool)
   *@Map: swift api Arrays$func prefix(upTo end: Int);Arrays$func suffix(from start: Int);NSArray$convenience init(array: [Any], copyItems flag: Bool)
*/
public class Arrays_copyOfRange_int_int{
  /**
   * Input:3
   * class0 class0={1,2,3,4,5}
   * from from=0
   * to to=3
   * output:1
   * ret0 ret0={1,2,3}
   */
    public static void arraycopyOfRange0(){
      System.out.println(">>>>>>>>>>>>");
      int[] class0=new int[]{1,2,3,4,5};
      int from=0;
      int to=3;
      int[] ret0=Arrays.copyOfRange(class0, from, to);
      for (int i = 0; i <5; i++) {
           assert(class0[i]==i+1);}
      assert(from==0);
      assert(to==3);
     for (int i = 0; i <3; i++) {
           assert(ret0[i]==i+1);}
     for (int i = 0; i <3; i++) {
           System.out.print(ret0[i] + "\t");}
    }
   /**
   * Input:3
   * class0 class0={1,2,3,4,5}
   * from from=1
   * to to=3
   * output:1
   * ret0 ret0={2,3}
   */
    public static void arraycopyOfRange1(){
      System.out.println("\n>>>>>>>>>>>>");
      int[] class0=new int[]{1,2,3,4,5};
      int from=1;
      int to=3;
      int[] ret0=Arrays.copyOfRange(class0, from, to);
      for (int i = 0; i <5; i++) {
           assert(class0[i]==i+1);}
      assert(from==1);
      assert(to==3);
     for (int i = 0; i <2; i++) {
           assert(ret0[i]==i+2);}
     for (int i = 0; i <2; i++) {
           System.out.print(ret0[i] + "\t");}
    }
  public static void main(String[] args) {
    Arrays_copyOfRange_int_int.arraycopyOfRange0();
    Arrays_copyOfRange_int_int.arraycopyOfRange1();
  }
}
