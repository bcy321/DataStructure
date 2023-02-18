package ch07;

import ch06.GenericPrinter;
import ch06.Powder;
import ch06.ThreeDPrinter1;

/*
* 제네릭 자료형 정의
* 클래스 사용하는 변수의 자료형이 여러개 일 수 있고 ,
* 그 기능은 동일한 경우 클래스의 자료형을 특징하지 않고 추후 해당 클래스를 사용할때 지정 할 수 있도록 선언
* 실제 사용되는 자료형의 변환은 컴파일러의 의해 검증되므로 안정적인 프로그래밍 방식식*
* */
public class GenericRun {
    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(plasticPrinter);
    }
}
