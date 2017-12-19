package cases;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;
import java.util.Map;

import R;
import butterknife.OnClick;
import rx.functions.Action1;

// Class used to test script add_javadoc.pl

public class Test {

    // Constructor

    public Test() {

    }

    // Constructor with parameters

    public Test(String param1, String param2) {

    }

    // Constructor with parameters

    public Test(String param1,
                String param2,
                @Nullable param3) {

    }

    // private constructor

    private Test(Object o) {

    }

    // Already commented constructor

    /**
     * Existing documentation
     *
     * @param o
     */
    public Test(Realm o) {

    }

    // private

    private void testPrivate() {

    }

    // protected

    protected void testProtected() {

    }

    // package

    void testPackage() {

    }

    // Comment with public keyword

    // public

    public void testPublic() {

    }

    // synchronized

    public synchronized void testPublicSynchro() {

    }

    // static

    public static void testPublicStatic() {

    }

    // Documented public

    /**
     * Already documented
     */
    public void testPublicDocumented() {

    }

    // static field

    public static final String PROD = "prod";

    // static

    public static void testPublicStatic() {

    }

    // final

    public final void testPublicFinal() {

    }

    // static final

    public static final void testPublicStaticFinal() {

    }

    // Return void

    public void returnVoid() {

    }

    // Return something

    public Object returnSth() {
        return null;
    }

    // Return complex type 1

    public List<Object> returnList() {
        return null;
    }

    // Return complex type 2

    public Map<Object, Object> returnMap() {
        return null;
    }

    // Getter

    public String getData() {
        return null;
    }

    // Wrong getter 1 (cause there is param)

    public String getDataWrong1(boolean x) {
        return null;
    }

    // Wrong getter 2 (cause return void)

    public void getDataWrong2() {

    }

    // Wrong getter name

    public Object forgetThing() {
        return null;
    }

    // Wrong getter name 2

    public Object getter() {
        return null;
    }

    // Setter

    public void setData(String data) {

    }

    // Wrong setter 1 (return != void)

    public String setDataWrong1(String data) {
        return null;
    }

    // Wrong setter 2 (multiple params)

    public void setData(String data, String other) {

    }

    // Wrong setter (no param)

    public void setDataWrong2() {

    }

    // Wrong setter 3 bad name

    public void set(String data) {

    }

    // Wrong setter (bad name)

    public void resetData(String data) {

    }

    // Wrong setter (bad name)

    public void setup(int backgroundRes) {

    }

    // final method

    public final void finalMethod() {

    }

    // final paramter

    public void finalParam(final String finalParam) {

    }

    // Annotation

    @Nullable
    public String convertStr(String str) {
        return null;
    }

    // Multiple annotations

    @Nullable
    @OnClick(R.id.test_premium_open_store_2)
    public void test() {

    }

    // 1 param

    public void oneParam(String param1) {
    }

    // 2 param 1 line

    public void twoParams(String param1, Object param2) {

    }

    // 2 params 2 lines

    public void twoParams2(String param1,
                           Object param2) {

    }

    // 3 params 3 lines

    public void threeParams(String param1,
                            Object param2,
                            Object param3) {

    }

    // 3 params 3 lines void

    public void threeParamsVoid(String param1,
                                Object param2,
                                Object param3) {
    }

    // 1 param annotated

    public void oneParamAnno(@Nullable String param1) {

    }

    // 2 param 1 line annotated

    public void twoParamsAnno(String param1, @Nullable Object param2) {

    }

    // 2 params 2 lines

    public void twoParamsAnno(String param1,
                              @Nullable Object param2) {

    }

    // Default param comment

    public void threeParamsAnno(Context context,
                                @Nullable Realm realm,
                                Void aVoid) {

    }

    // 1 param with composed type

    public Map<Object, Object> composedType1(@Nullable Map<Object, Map<Object, Object>> composedParam) {
        return null;
    }

    // 1 param with composed type

    public List<Object> composedType2(@Nullable Map<Object, Object> composedParam1,
                                      @Nullable Map<Object, Map<Object, Object>> composedParam2) {
        return null;
    }

    // Return type with []

    public Object[] newArray(int size) {
        return null;
    }

    // Special comments

    public void retrieveSeveralData() {

    }

    public void computeMaximum() {

    }

    public void with() {

    }

    public void withContext(Context context) {

    }

    // Maxi combo

    @Nullable
    @OnClick(R.id.test_premium_open_store_2)
    public void testCombo1(String param1,
                           Object param2) {

    }

    @Nullable
    @OnClick(R.id.test_premium_open_store_2)
    public static final boolean testCombo2(String param1,
                                           Object param2,
                                           Object param3) {
        return false;
    }

    @Nullable
    @OnClick(R.id.test_premium_open_store_2)
    public static final Object testCombo(@NonNull Realm param1,
                                         Object param2,
                                         @NonNull Object param3,
                                         @Nullable Realm realm,
                                         @NonNull Context ctx) {
        return null;
    }

    // Documented combo

    /**
     * Documented combo
     *
     * @param param1
     * @param param2
     * @param param3
     * @return
     */
    @Nullable
    @OnClick(R.id.test_premium_open_store_2)
    public static final Object testCombo4(@NonNull String param1,
                                          Object param2,
                                          @NonNull Object param3) {
        return null;
    }

    // Initialized member

    public static final Creator<ProcedureSelection> CREATOR = new Creator<ProcedureSelection>() {

    };

    // Inner interface

    public interface MyInnerInterface {

        // API

        void onAction();

        // Documented API

        /**
         * Documentation
         */
        void onActionDocumented();

        // Complexe cases

        @Nullable
        Object onDoSomething(@NonNull Context one, String two);

        @Nullable
        Object onDoSomethingElse(@NonNull Object one,
                                 String two);
    }

    // Already documented interface, but API not documented

    /**
     * Existing doc
     */
    public interface MyInnerInterfaceSpecial {

        // API not documented

        void onAction();

        // API documented, parameters on two lines

        /**
         * documentation
         *
         * @param param1
         * @param param2
         */
        void documented(String param1,
                        String param2);

        // Complex return type

        Observable<Response<WSAddBankResult>> addBankConnection();

        // Complex return type 2

        Observable<Response<WSAddBankResult, Void>> addBankConnection();

        // Complex parameter

        void getBankConnection(@Path("connectionId") final int connectionId);

        // Complex parammeters multiline

        void getOtherBankConnection(@Path("connectionId") final int connectionId,
                                    @Path("connectionId") final int connectionId2,
                                    @Path("connectionId") final int connectionId3) {

        }
    }

    public @interface ScrollDirection {

    }
}

// documented class

/**
 * Already documented class
 */
public class DocumentedClass {

}

// Enum

public enum Enum1 {
    ONE,
    TWO
}

// Documented Enum

/**
 * Documentation
 */
public enum Enum2 {
    ONE,
    TWO
}

// Inner class

public class ContainingClass {

    // Inner class

    public class InnerClass {

        // Inner method

        public void innerMethod() {

        }

        // Documented inner method

        /**
         * Documentation
         */
        public void innerMethodDocumented() {

        }
    }

    // Enum

    public enum Enum1 {
        ONE,
        TWO
    }

    // Documented Enum

    /**
     * Documentation
     */
    public enum Enum2 {
        ONE,
        TWO
    }
}

// Interface

public interface MyInterface {

    // API

    void onAction();

    // Documented API

    /**
     * Documentation
     */
    void onActionDocumented();
}

// Interface with param

public interface ISave<I> {

}

// Absctract class

public abstract class AbstractClass {

    // Abstract method

    public abstract void test();
}

// Generic classes

public abstract class AbstractClassGen1<T> {

    public abstract T test();
}

public abstract class AbstractClassGen2<T, U> {

    public abstract T testT();

    public abstract U testU();
}

public abstract class AbstractClassGen3<T, U extends Object> {

    public abstract T testT();

    public abstract U testU(String toto);
}

// Implementation of generic class

public class ImplementationGen1 extends AbstractClassGen1<Object> {

    public ImplementationGen1(@Nullable Void aVoid,
                              Realm realm,
                              Object longParamName) {

    }

    @Override
    public Object test() {
        return null;
    }
}

public class ImplementationGen2 extends AbstractClassGen2<Object, String> {

    @Override
    public Object testT() {
        return null;
    }

    @Override
    public String testU() {
        return null;
    }
}

public class ImplementationGen3 extends AbstractClassGen3<Object, Object> {

    @Override
    public Object testT() {
        return null;
    }

    @Override
    public Object testU(String toto) {
        return null;
    }
}

// Class which implements interface

public class InterfaceImplementation implements Action1<Void> {

    @Override
    public void call(Void aVoid) {

    }
}
