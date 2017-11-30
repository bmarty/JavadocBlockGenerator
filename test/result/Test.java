package cases;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;
import java.util.Map;

import butterknife.OnClick;
import R;
import rx.functions.Action1;

// Class used to test script add_javadoc.pl

/**
 * JBG Documentation for class Test
 */
public class Test {

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
     * JBG: Missing documentation
     */
    public void testPublic() {

    }

    // Documented public

    /**
     * Already documented
     */
    public void testPublicDocumented() {

    }

    // static

    /**
     * JBG: Missing documentation
     */
    public static void testPublicStatic() {

    }

    // final

    /**
     * JBG: Missing documentation
     */
    public final void testPublicFinal() {

    }

    // static final

    /**
     * JBG: Missing documentation
     */
    public static final void testPublicStaticFinal() {

    }

    // Return void

    /**
     * JBG: Missing documentation
     */
    public void returnVoid() {

    }

    // Return something

    /**
     * JBG: Missing documentation
     *
     * @return Object
     */
    public Object returnSth() {
        return null;
    }

    // Return complex type 1

    /**
     * JBG: Missing documentation
     *
     * @return List<Object>
     */
    public List<Object> returnList() {
        return null;
    }

    // Return complex type 2

    /**
     * JBG: Missing documentation
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
     * JBG: Missing documentation
     *
     * @param x
     * @return String
     */
    public String getDataWrong1(boolean x) {
        return null;
    }

    // Wrong getter 2 (cause return void)

    /**
     * JBG: Missing documentation
     *
     * @param x
     */
    public void getDataWrong2(boolean x) {

    }

    // Setter

    /**
     * JBG: Missing documentation
     *
     * @param data
     */
    public void setData(String data) {

    }

    // Wrong setter 1 (return != void)

    /**
     * JBG: Missing documentation
     *
     * @param data
     * @return String
     */
    public String setDataWrong1(String data) {
        return null;
    }

    // Wrong setter 2 (multiple params)

    /**
     * JBG: Missing documentation
     *
     * @param data
     * @param other
     */
    public void setData(String data, String other) {

    }

    // Wrong setter 3 bad name

    /**
     * JBG: Missing documentation
     *
     * @param data
     */
    public void set(String data) {

    }

    // Annotation

    /**
     * JBG: Missing documentation
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
     * JBG: Missing documentation
     */
    @Nullable
    @OnClick(R.id.test_premium_open_store_2)
    public void test() {

    }

    // 1 param

    /**
     * JBG: Missing documentation
     *
     * @param param1
     */
    public void oneParam(String param1) {
    }

    // 2 param 1 line

    /**
     * JBG: Missing documentation
     *
     * @param param1
     * @param param2
     */
    public void twoParam(String param1, Object param2) {

    }

    // 2 params 2 lines

    /**
     * JBG: Missing documentation
     *
     * @param param1
     * @param param2
     */
    public void twoParam2(String param1,
                          Object param2) {

    }

    // 3 params 3 lines

    /**
     * JBG: Missing documentation
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
     * JBG: Missing documentation
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
     * JBG: Missing documentation
     *
     * @param param1
     */
    public void oneParamAnno(@Nullable String param1) {

    }

    // 2 param 1 line annotated

    /**
     * JBG: Missing documentation
     *
     * @param param1
     * @param param2
     */
    public void twoParamAnno(String param1, @Nullable Object param2) {

    }

    // 2 params 2 lines

    /**
     * JBG: Missing documentation
     *
     * @param param1
     * @param param2
     */
    public void twoParam2Anno(String param1,
                              @Nullable Object param2) {

    }

    // Maxi combo

    /**
     * JBG: Missing documentation
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
     * JBG: Missing documentation
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
     * JBG: Missing documentation
     *
     * @param param1
     * @param param2
     * @param param3
     * @return Object
     */
    @Nullable
    @OnClick(R.id.test_premium_open_store_2)
    public static final Object testCombo3(@NonNull String param1,
                                          Object param2,
                                          @NonNull Object param3) {
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
}

// documented class

/**
 * Already documented class
 */
public class DocumentedClass {

}

// Inner class

/**
 * JBG Documentation for class ContainingClass
 */
public class ContainingClass {

    // Inner class

    /**
     * JBG Documentation for class InnerClass
     */
    public class InnerClass {

        // Inner method

        /**
         * JBG: Missing documentation
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
}

// Interface

/**
 * JBG Documentation for interface MyInterface
 */
public interface MyInterface {

    // API

    /**
     * JBG: Missing documentation
     */
    public void onAction();

    // Documented API

    /**
     * Documentation
     */
    public void onActionDocumented();
}

// Absctract class

/**
 * JBG Documentation for class AbstractClass
 */
public abstract class AbstractClass {

    // Abstract method

    /**
     * JBG: Missing documentation
     */
    public abstract void test();
}

// Generic classes

/**
 * JBG Documentation for class AbstractClassGen1
 *
 * @param <T>
 */
public abstract class AbstractClassGen1<T> {

    /**
     * JBG: Missing documentation
     *
     * @return T
     */
    public abstract T test();
}

/**
 * JBG Documentation for class AbstractClassGen2
 *
 * @param <T>
 * @param <U>
 */
public abstract class AbstractClassGen2<T, U> {

    /**
     * JBG: Missing documentation
     *
     * @return T
     */
    public abstract T testT();

    /**
     * JBG: Missing documentation
     *
     * @return U
     */
    public abstract U testU();
}

/**
 * JBG Documentation for class AbstractClassGen3
 *
 * @param <T>
 * @param <U>
 */
public abstract class AbstractClassGen3<T, U extends Object> {

    /**
     * JBG: Missing documentation
     *
     * @return T
     */
    public abstract T testT();

    /**
     * JBG: Missing documentation
     *
     * @param toto
     * @return U
     */
    public abstract U testU(String toto);
}

// Implementation of generic class

/**
 * JBG Documentation for class ImplementationGen1
 */
public class ImplementationGen1 extends AbstractClassGen1<Object> {

    /**
     * JBG: Missing documentation
     *
     * @return Object
     */
    @Override
    public Object test() {
        return null;
    }
}

/**
 * JBG Documentation for class ImplementationGen2
 */
public class ImplementationGen2 extends AbstractClassGen2<Object, String> {

    /**
     * JBG: Missing documentation
     *
     * @return Object
     */
    @Override
    public Object testT() {
        return null;
    }

    /**
     * JBG: Missing documentation
     *
     * @return String
     */
    @Override
    public String testU() {
        return null;
    }
}

/**
 * JBG Documentation for class ImplementationGen3
 */
public class ImplementationGen3 extends AbstractClassGen3<Object, Object> {

    /**
     * JBG: Missing documentation
     *
     * @return Object
     */
    @Override
    public Object testT() {
        return null;
    }

    /**
     * JBG: Missing documentation
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
 * JBG Documentation for class InterfaceImplementation
 */
public class InterfaceImplementation implements Action1<Void> {

    /**
     * JBG: Missing documentation
     *
     * @param aVoid
     */
    @Override
    public void call(Void aVoid) {

    }
}
// Done! 54 javadoc block(s) added to 1 file(s)
