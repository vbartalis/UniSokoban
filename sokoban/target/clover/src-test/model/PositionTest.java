/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {static class __CLR4_3_1jtjtjvpo50op{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557951569459L,8589935092L,735,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    void setPosition() {try{__CLR4_3_1jtjtjvpo50op.R.inc(713);
        __CLR4_3_1jtjtjvpo50op.R.inc(714);List<List<Character>> testCharMap = new ArrayList<>();
        __CLR4_3_1jtjtjvpo50op.R.inc(715);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1jtjtjvpo50op.R.inc(716);testCharMap.add(Arrays.asList('#',' ','@',' ',' ','#'));
        __CLR4_3_1jtjtjvpo50op.R.inc(717);testCharMap.add(Arrays.asList('#',' ',' ','$',' ','#'));
        __CLR4_3_1jtjtjvpo50op.R.inc(718);testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1jtjtjvpo50op.R.inc(719);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1jtjtjvpo50op.R.inc(720);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1jtjtjvpo50op.R.inc(721);Position position = new Position();
        __CLR4_3_1jtjtjvpo50op.R.inc(722);position.setPosition(testCharMap);
        __CLR4_3_1jtjtjvpo50op.R.inc(723);assertEquals(position.getH(), 1);
        __CLR4_3_1jtjtjvpo50op.R.inc(724);assertEquals(position.getW(), 2);

        __CLR4_3_1jtjtjvpo50op.R.inc(725);testCharMap = new ArrayList<>();
        __CLR4_3_1jtjtjvpo50op.R.inc(726);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1jtjtjvpo50op.R.inc(727);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1jtjtjvpo50op.R.inc(728);testCharMap.add(Arrays.asList('#',' ',' ','$',' ','#'));
        __CLR4_3_1jtjtjvpo50op.R.inc(729);testCharMap.add(Arrays.asList('#',' ','*',' ','+','#'));
        __CLR4_3_1jtjtjvpo50op.R.inc(730);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1jtjtjvpo50op.R.inc(731);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1jtjtjvpo50op.R.inc(732);position.setPosition(testCharMap);
        __CLR4_3_1jtjtjvpo50op.R.inc(733);assertEquals(position.getH(), 3);
        __CLR4_3_1jtjtjvpo50op.R.inc(734);assertEquals(position.getW(), 4);
    }finally{__CLR4_3_1jtjtjvpo50op.R.flushNeeded();}}
}