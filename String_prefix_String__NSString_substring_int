/**类名_方法名(_形参类型)*__类名_方法名(_形参类型)*
 * @author: MF1933016+dingzhu
 *  @className: String_prefix_String$NSString_substring_int
 *  @apiSignature: String$func prefix(through position: String.Index) -> Substring;String$func substring(from: Int) -> String
 *  @description: Test swift api String$prefix(through position: String.Index);NSString$substring(to: Int)
 *  @Map: java.lang.String$public String substring (int beginIndex, int endIndex)
 */

import Foundation
class String_prefix_String__NSString_substring_int{
    /**
     *input : 3
     *class0 class0="helloworld"
     *through String.Index$through
     *from from=2
     *ouput : 2
     *ret0 ret0="hellow"
     *ret1 ret1="llow"
     *String.Index$through-String$index(_?i:?String.Index,?offsetBy?n:?String.IndexDistance)?&?String.Index=String$startIndex;offsetBy=2?&?https://stackoverflow.com/questions/32967445/how-to-check-what-a-string-starts-with-prefix-or-ends-with-suffix-in-swift
     */
    static func prefix_substring0(){
        print(">>>>>>>>");
        let class0=NSString(string:"helloworld");
        let from=2;
	let ret0=class0.substring(from:from);
	let class1=String(ret0);
        let through=class1.index(ret0.startIndex, offsetBy: 7);
        let ret1=class1.prefix(through: through);
        assert(class0=="helloworld");
	assert(from==2);
	assert(ret1=="lloworld");
        print(ret1);
        
    }
     /**
     *input : 3
     *class0 class0="helloworld"
     *through String.Index$through
     *from from=2
     *ouput : 2
     *ret0 ret0="hellowor"
     *ret1 ret1="llowor"
     **String.Index$through-String$index(_?i:?String.Index,?offsetBy?n:?String.IndexDistance)?&?String.Index=String$startIndex;offsetBy=2?&?https://stackoverflow.com/questions/32967445/how-to-check-what-a-string-starts-with-prefix-or-ends-with-suffix-in-swift
     */
    static func prefix_substring1(){
        print(">>>>>>>>");
        let class0=NSString(string:"helloworld");
        let from=2;
	let ret0=class0.substring(from:from);
	let class1=String(ret0);
        let through=class1.index(ret0.startIndex, offsetBy: 5);
        let ret1=class1.prefix(through: through);
        assert(class0=="helloworld");
	assert(from==2);
	assert(ret1=="llowor");
        print(ret1);
        
    }
}
String_prefix_String__NSString_substring_int.prefix_substring0()
String_prefix_String__NSString_substring_int.prefix_substring1()
