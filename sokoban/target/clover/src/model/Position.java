/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Position {public static class __CLR4_3_18g8gjvp8kay3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557925408667L,8589935092L,318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    int h;
    int w;


    public void setPosition(List<List<Character>> charMap) {try{__CLR4_3_18g8gjvp8kay3.R.inc(304);
        __CLR4_3_18g8gjvp8kay3.R.inc(305);for (int i = 0; (((i < charMap.size())&&(__CLR4_3_18g8gjvp8kay3.R.iget(306)!=0|true))||(__CLR4_3_18g8gjvp8kay3.R.iget(307)==0&false)); i++) {{
            __CLR4_3_18g8gjvp8kay3.R.inc(308);if ((((charMap.get(i).contains('@'))&&(__CLR4_3_18g8gjvp8kay3.R.iget(309)!=0|true))||(__CLR4_3_18g8gjvp8kay3.R.iget(310)==0&false))) {{
                __CLR4_3_18g8gjvp8kay3.R.inc(311);h = i;
                __CLR4_3_18g8gjvp8kay3.R.inc(312);w = charMap.get(i).indexOf('@');
            } }else {__CLR4_3_18g8gjvp8kay3.R.inc(313);if ((((charMap.get(i).contains('+'))&&(__CLR4_3_18g8gjvp8kay3.R.iget(314)!=0|true))||(__CLR4_3_18g8gjvp8kay3.R.iget(315)==0&false))) {{
                __CLR4_3_18g8gjvp8kay3.R.inc(316);h = i;
                __CLR4_3_18g8gjvp8kay3.R.inc(317);w = charMap.get(i).indexOf('+');
            }
        }}}
    }}finally{__CLR4_3_18g8gjvp8kay3.R.flushNeeded();}}
}