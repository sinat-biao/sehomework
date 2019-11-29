/**类名_方法名(_形参类型)*
 * @author: MF1933041_江彪
 * @className: Array_insert_Collection_int
 * @apiSignature: Array$ func insert<C>(contentsOf newElements: C, at i: Int) where C : Collection, Self.Element == C.Element 
 * @description: Test swift api Array$insert<C>(contentsOf newElements: C, at i: Int) where C : Collection, Self.Element == C.Element 
 * @Map: java.util.ArrayList$ public boolean addAll(Collection<? extends E> c)
 */
import Foundation

class Array_insert_Collection_int {

    /**
     * input: 3
     * class0 class0=[1, 2, 3, 4, 5]
     * contentsOf contentsOf=[6, 7]
	 * at at=5
     * output: 0
     */
    static func insert0() {
        print(">>>>>>>>>>>>")
        var class0: Array = [1, 2, 3, 4, 5]
        let contentsOf: Array = [6, 7]
		let at = 5
        class0.insert(contentsOf: contentsOf, at: at)
        assert(class0 == [1, 2, 3, 4, 5, 6, 7])
        print(class0)
    }
    
    /**
     * input: 3
     * class0 class0=["I", "am", "from"]
     * contentsOf contentsOf=["南", "京"]
	 * at at=3
     * output: 0
     */
    static func insert1() {
        print(">>>>>>>>>>>>")
        var class0:Array = ["I", "am", "from"]
        let contentsOf:Array = ["南", "京"]
        let at = 3
        class0.insert(contentsOf: contentsOf, at: at)
        assert(class0 == ["I", "am", "from", "南", "京"])
        print(class0)
    }
    
}
Array_insert_Collection_int.insert0()
Array_insert_Collection_int.insert1()