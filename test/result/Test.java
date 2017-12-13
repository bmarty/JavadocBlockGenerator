package cases;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;
import java.util.Map;

import R;
import butterknife.OnClick;
import rx.functions.Action1;

// Class used to test script add_javadoc.pl

/**
 * JBG: Documentation for class Test
 */
public class Test {

    // Constructor

    /**
     * Constructor for class Test
     */
    public Test() {

    }

    // Constructor with parameters

    /**
     * Constructor for class Test
     *
     * @param param1
     * @param param2
     */
    public Test(String param1, String param2) {

    }

    // Constructor with parameters

    /**
     * Constructor for class Test
     *
     * @param param1
     * @param param2
     * @param param3
     */
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

    /**
     * Test public
     */
    public void testPublic() {

    }

    // synchronized

    /**
     * Test public synchro
     */
    public synchronized void testPublicSynchro() {

    }

    // static

    /**
     * Test public static
     */
    public static void testPublicStatic() {

    }

    // Documented public

    /**
     * Already documented
     */
    public void testPublicDocumented() {

    }

    // static field

    /**
     * JBG: Missing documentation for PROD
     */
    public static final String PROD = "prod";

    // static

    /**
     * Test public static
     */
    public static void testPublicStatic() {

    }

    // final

    /**
     * Test public final
     */
    public final void testPublicFinal() {

    }

    // static final

    /**
     * Test public static final
     */
    public static final void testPublicStaticFinal() {

    }

    // Return void

    /**
     * Return void
     */
    public void returnVoid() {

    }

    // Return something

    /**
     * Return sth
     *
     * @return Object
     */
    public Object returnSth() {
        return null;
    }

    // Return complex type 1

    /**
     * Return list
     *
     * @return List<Object>
     */
    public List<Object> returnList() {
        return null;
    }

    // Return complex type 2

    /**
     * Return map
     *
     * @return Map<Object, Object>
     */
    public Map<Object, Object> returnMap() {
        return null;
    }

    // Getter

    /**
     * Getter for data
     *
     * @return value of data
     */
    public String getData() {
        return null;
    }

    // Wrong getter 1 (cause there is param)

    /**
     * JBG: Missing documentation for getDataWrong1
     *
     * @param x
     * @return String
     */
    public String getDataWrong1(boolean x) {
        return null;
    }

    // Wrong getter 2 (cause return void)

    /**
     * JBG: Missing documentation for getDataWrong2
     */
    public void getDataWrong2() {

    }

    // Wrong getter name

    /**
     * Forget thing
     *
     * @return Object
     */
    public Object forgetThing() {
        return null;
    }

    // Setter

    /**
     * Setter for data
     *
     * @param data the new value for data
     */
    public void setData(String data) {

    }

    // Wrong setter 1 (return != void)

    /**
     * JBG: Missing documentation for setDataWrong1
     *
     * @param data
     * @return String
     */
    public String setDataWrong1(String data) {
        return null;
    }

    // Wrong setter 2 (multiple params)

    /**
     * Set data
     *
     * @param data
     * @param other
     */
    public void setData(String data, String other) {

    }

    // Wrong setter (no param)

    /**
     * JBG: Missing documentation for setDataWrong2
     */
    public void setDataWrong2() {

    }

    // Wrong setter 3 bad name

    /**
     * JBG: Missing documentation for set
     *
     * @param data
     */
    public void set(String data) {

    }

    // Wrong setter (bad name)

    /**
     * Reset data
     *
     * @param data
     */
    public void resetData(String data) {

    }

    // final method

    /**
     * Final method
     */
    public final void finalMethod() {

    }

    // final paramter

    /**
     * Final param
     *
     * @param finalParam
     */
    public void finalParam(final String finalParam) {

    }

    // Annotation

    /**
     * Convert str
     *
     * @param str
     * @return String
     */
    @Nullable
    public String convertStr(String str) {
        return null;
    }

    // Multiple annotations

    /**
     * JBG: Missing documentation for test
     */
    @Nullable
    @OnClick(R.id.test_premium_open_store_2)
    public void test() {

    }

    // 1 param

    /**
     * One param
     *
     * @param param1
     */
    public void oneParam(String param1) {
    }

    // 2 param 1 line

    /**
     * Two params
     *
     * @param param1
     * @param param2
     */
    public void twoParams(String param1, Object param2) {

    }

    // 2 params 2 lines

    /**
     * JBG: Missing documentation for twoParams2
     *
     * @param param1
     * @param param2
     */
    public void twoParams2(String param1,
                           Object param2) {

    }

    // 3 params 3 lines

    /**
     * Three params
     *
     * @param param1
     * @param param2
     * @param param3
     */
    public void threeParams(String param1,
                            Object param2,
                            Object param3) {

    }

    // 3 params 3 lines void

    /**
     * Three params void
     *
     * @param param1
     * @param param2
     * @param param3
     */
    public void threeParamsVoid(String param1,
                                Object param2,
                                Object param3) {
    }

    // 1 param annotated

    /**
     * One param anno
     *
     * @param param1
     */
    public void oneParamAnno(@Nullable String param1) {

    }

    // 2 param 1 line annotated

    /**
     * Two params anno
     *
     * @param param1
     * @param param2
     */
    public void twoParamsAnno(String param1, @Nullable Object param2) {

    }

    // 2 params 2 lines

    /**
     * Two params anno
     *
     * @param param1
     * @param param2
     */
    public void twoParamsAnno(String param1,
                              @Nullable Object param2) {

    }

    // Default param comment

    /**
     * Three params anno
     *
     * @param context the Android context
     * @param realm   the realm database instance
     * @param aVoid   ignored parameter
     */
    public void threeParamsAnno(Context context,
                                @Nullable Realm realm,
                                Void aVoid) {

    }

    // 1 param with composed type

    /**
     * JBG: Missing documentation for composedType1
     *
     * @param composedParam
     * @return Map<Object, Object>
     */
    public Map<Object, Object> composedType1(@Nullable Map<Object, Map<Object, Object>> composedParam) {
        return null;
    }

    // 1 param with composed type

    /**
     * JBG: Missing documentation for composedType2
     *
     * @param composedParam1
     * @param composedParam2
     * @return List<Object>
     */
    public List<Object> composedType2(@Nullable Map<Object, Object> composedParam1,
                                      @Nullable Map<Object, Map<Object, Object>> composedParam2) {
        return null;
    }

    // Return type with []

    /**
     * New array
     *
     * @param size
     * @return Object[]
     */
    public Object[] newArray(int size) {
        return null;
    }

    // Special comments

    /**
     * Retrieve several data
     */
    public void retrieveSeveralData() {

    }

    /**
     * Compute maximum
     */
    public void computeMaximum() {

    }

    /**
     * JBG: Missing documentation for with
     */
    public void with() {

    }

    /**
     * Configure this object with a context
     *
     * @param context the Android context
     */
    public void withContext(Context context) {

    }

    // Maxi combo

    /**
     * JBG: Missing documentation for testCombo1
     *
     * @param param1
     * @param param2
     */
    @Nullable
    @OnClick(R.id.test_premium_open_store_2)
    public void testCombo1(String param1,
                           Object param2) {

    }

    /**
     * JBG: Missing documentation for testCombo2
     *
     * @param param1
     * @param param2
     * @param param3
     * @return boolean
     */
    @Nullable
    @OnClick(R.id.test_premium_open_store_2)
    public static final boolean testCombo2(String param1,
                                           Object param2,
                                           Object param3) {
        return false;
    }

    /**
     * Test combo
     *
     * @param param1 the realm database instance
     * @param param2
     * @param param3
     * @param realm  the realm database instance
     * @param ctx    the Android context
     * @return Object
     */
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

    /**
     * JBG: Missing documentation for CREATOR
     */
    public static final Creator<ProcedureSelection> CREATOR = new Creator<ProcedureSelection>() {

    };

    // Inner interface

    /**
     * JBG: Documentation for interface MyInnerInterface
     */
    public interface MyInnerInterface {

        // API

        /**
         * On action
         */
        void onAction();

        // Documented API

        /**
         * Documentation
         */
        void onActionDocumented();

        // Complexe cases

        /**
         * On do something
         *
         * @param one the Android context
         * @param two
         * @return Object
         */
        @Nullable
        Object onDoSomething(@NonNull Context one, String two);

        /**
         * On do something else
         *
         * @param one
         * @param two
         * @return Object
         */
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

        /**
         * On action
         */
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

        /**
         * Add bank connection
         *
         * @return Observable<Response<WSAddBankResult>>
         */
        Observable<Response<WSAddBankResult>> addBankConnection();

        // Complex return type 2

        /**
         * Add bank connection
         *
         * @return Observable<Response<WSAddBankResult, Void>>
         */
        Observable<Response<WSAddBankResult, Void>> addBankConnection();

        // Complex parameter

        /**
         * Get bank connection
         *
         * @param connectionId
         */
        void getBankConnection(@Path("connectionId") final int connectionId);
    }
}

// documented class

/**
 * Already documented class
 */
public class DocumentedClass {

}

// Enum

/**
 * JBG: Documentation for enum Enum1
 */
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

/**
 * JBG: Documentation for class ContainingClass
 */
public class ContainingClass {

    // Inner class

    /**
     * JBG: Documentation for class InnerClass
     */
    public class InnerClass {

        // Inner method

        /**
         * Inner method
         */
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

    /**
     * JBG: Documentation for enum Enum1
     */
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

/**
 * JBG: Documentation for interface MyInterface
 */
public interface MyInterface {

    // API

    /**
     * On action
     */
    void onAction();

    // Documented API

    /**
     * Documentation
     */
    void onActionDocumented();
}

// Absctract class

/**
 * JBG: Documentation for class AbstractClass
 */
public abstract class AbstractClass {

    // Abstract method

    /**
     * JBG: Missing documentation for test
     */
    public abstract void test();
}

// Generic classes

/**
 * JBG: Documentation for class AbstractClassGen1
 *
 * @param <T>
 */
public abstract class AbstractClassGen1<T> {

    /**
     * JBG: Missing documentation for test
     *
     * @return T
     */
    public abstract T test();
}

/**
 * JBG: Documentation for class AbstractClassGen2
 *
 * @param <T>
 * @param <U>
 */
public abstract class AbstractClassGen2<T, U> {

    /**
     * Test t
     *
     * @return T
     */
    public abstract T testT();

    /**
     * Test u
     *
     * @return U
     */
    public abstract U testU();
}

/**
 * JBG: Documentation for class AbstractClassGen3
 *
 * @param <T>
 * @param <U>
 */
public abstract class AbstractClassGen3<T, U extends Object> {

    /**
     * Test t
     *
     * @return T
     */
    public abstract T testT();

    /**
     * Test u
     *
     * @param toto
     * @return U
     */
    public abstract U testU(String toto);
}

// Implementation of generic class

/**
 * JBG: Documentation for class ImplementationGen1
 */
public class ImplementationGen1 extends AbstractClassGen1<Object> {

    /**
     * Constructor for class ImplementationGen1
     *
     * @param aVoid         ignored parameter
     * @param realm         the realm database instance
     * @param longParamName
     */
    public ImplementationGen1(@Nullable Void aVoid,
                              Realm realm,
                              Object longParamName) {

    }

    /**
     * JBG: Missing documentation for test
     *
     * @return Object
     */
    @Override
    public Object test() {
        return null;
    }
}

/**
 * JBG: Documentation for class ImplementationGen2
 */
public class ImplementationGen2 extends AbstractClassGen2<Object, String> {

    /**
     * Test t
     *
     * @return Object
     */
    @Override
    public Object testT() {
        return null;
    }

    /**
     * Test u
     *
     * @return String
     */
    @Override
    public String testU() {
        return null;
    }
}

/**
 * JBG: Documentation for class ImplementationGen3
 */
public class ImplementationGen3 extends AbstractClassGen3<Object, Object> {

    /**
     * Test t
     *
     * @return Object
     */
    @Override
    public Object testT() {
        return null;
    }

    /**
     * Test u
     *
     * @param toto
     * @return Object
     */
    @Override
    public Object testU(String toto) {
        return null;
    }
}

// Class which implements interface

/**
 * JBG: Documentation for class InterfaceImplementation
 */
public class InterfaceImplementation implements Action1<Void> {

    /**
     * JBG: Missing documentation for call
     *
     * @param aVoid ignored parameter
     */
    @Override
    public void call(Void aVoid) {

    }
}
// Done! 80 javadoc block(s) added to 1 file(s)
