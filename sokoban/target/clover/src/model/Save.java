/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package model;

import lombok.*;

/**
 * Class representing the best result of the player from a level.
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Save {public static class __CLR4_3_11l11l1jvpn03t9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557949660591L,8589935092L,2062,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * The best result of a level.
     */
    String recordStep;
    /**
     * The id representing the level.
     */
    int levelNumber;

    /**
     * Constructor of {@link Save} class, creates an empty save.
     * @param levelNumber indicates the id representing which level does the save correspond to.
     */
    public Save(int levelNumber) {try{__CLR4_3_11l11l1jvpn03t9.R.inc(2053);
        __CLR4_3_11l11l1jvpn03t9.R.inc(2054);this.recordStep = "-";
        __CLR4_3_11l11l1jvpn03t9.R.inc(2055);this.levelNumber = levelNumber;
    }finally{__CLR4_3_11l11l1jvpn03t9.R.flushNeeded();}}

    /**
     * Checks if the {@code string} if a new record.
     * @param string the value to be chacked if it is a new record.
     * @return true if {@code string} is a new record.
     */
    public boolean isNewRecord(String string){try{__CLR4_3_11l11l1jvpn03t9.R.inc(2056);
        __CLR4_3_11l11l1jvpn03t9.R.inc(2057);if ((((recordStep.contentEquals("-") || Integer.parseInt(string) < Integer.parseInt(recordStep))&&(__CLR4_3_11l11l1jvpn03t9.R.iget(2058)!=0|true))||(__CLR4_3_11l11l1jvpn03t9.R.iget(2059)==0&false))) {{
            __CLR4_3_11l11l1jvpn03t9.R.inc(2060);return true;
        }
        }__CLR4_3_11l11l1jvpn03t9.R.inc(2061);return false;
    }finally{__CLR4_3_11l11l1jvpn03t9.R.flushNeeded();}}


}
