package soot.jimple.paddle;

import soot.*;
import soot.util.*;
import soot.jimple.paddle.bdddomains.*;
import java.util.*;

public final class BDDHierarchy {
    public jedd.internal.RelationContainer subtypeRelation() {
        update();
        return new jedd.internal.RelationContainer(new jedd.Attribute[] { supt.v(), subt.v() },
                                                   new jedd.PhysicalDomain[] { T1.v(), T2.v() },
                                                   ("return jedd.internal.Jedd.v().union(jedd.internal.Jedd.v().r" +
                                                    "ead(jedd.internal.Jedd.v().replace(closure, new jedd.Physica" +
                                                    "lDomain[...], new jedd.PhysicalDomain[...])), jedd.internal." +
                                                    "Jedd.v().replace(anySub, new jedd.PhysicalDomain[...], new j" +
                                                    "edd.PhysicalDomain[...])); at /home/research/ccl/olhota/soot" +
                                                    "-trunk2/src/soot/jimple/paddle/BDDHierarchy.jedd:36,8-14"),
                                                   jedd.internal.Jedd.v().union(jedd.internal.Jedd.v().read(jedd.internal.Jedd.v().replace(closure,
                                                                                                                                           new jedd.PhysicalDomain[] { T2.v(), T1.v() },
                                                                                                                                           new jedd.PhysicalDomain[] { T1.v(), T2.v() })),
                                                                                jedd.internal.Jedd.v().replace(anySub,
                                                                                                               new jedd.PhysicalDomain[] { T2.v(), T1.v() },
                                                                                                               new jedd.PhysicalDomain[] { T1.v(), T2.v() })));
    }
    
    public void update() {
        updateTypes();
        updateClosure();
    }
    
    private void updateTypes() {
        ArrayNumberer tn = Scene.v().getTypeNumberer();
        for (int i = maxType + 1; i <= tn.size(); i++) { processNewType((Type) tn.get(i)); }
    }
    
    private final jedd.internal.RelationContainer identity =
      new jedd.internal.RelationContainer(new jedd.Attribute[] { subt.v(), supt.v() },
                                          new jedd.PhysicalDomain[] { T1.v(), T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.subt:soot.jimple.padd" +
                                           "le.bdddomains.T1, soot.jimple.paddle.bdddomains.supt:soot.ji" +
                                           "mple.paddle.bdddomains.T2> identity = jedd.internal.Jedd.v()" +
                                           ".falseBDD() at /home/research/ccl/olhota/soot-trunk2/src/soo" +
                                           "t/jimple/paddle/BDDHierarchy.jedd:57,12-30"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    private final jedd.internal.RelationContainer extend =
      new jedd.internal.RelationContainer(new jedd.Attribute[] { subt.v(), supt.v() },
                                          new jedd.PhysicalDomain[] { T1.v(), T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.subt:soot.jimple.padd" +
                                           "le.bdddomains.T1, soot.jimple.paddle.bdddomains.supt:soot.ji" +
                                           "mple.paddle.bdddomains.T2> extend = jedd.internal.Jedd.v().f" +
                                           "alseBDD() at /home/research/ccl/olhota/soot-trunk2/src/soot/" +
                                           "jimple/paddle/BDDHierarchy.jedd:62,12-30"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    public jedd.internal.RelationContainer extend() {
        return new jedd.internal.RelationContainer(new jedd.Attribute[] { supt.v(), subt.v() },
                                                   new jedd.PhysicalDomain[] { T3.v(), T1.v() },
                                                   ("return jedd.internal.Jedd.v().replace(extend, new jedd.Physi" +
                                                    "calDomain[...], new jedd.PhysicalDomain[...]); at /home/rese" +
                                                    "arch/ccl/olhota/soot-trunk2/src/soot/jimple/paddle/BDDHierar" +
                                                    "chy.jedd:63,35-41"),
                                                   jedd.internal.Jedd.v().replace(extend,
                                                                                  new jedd.PhysicalDomain[] { T2.v() },
                                                                                  new jedd.PhysicalDomain[] { T3.v() }));
    }
    
    private final jedd.internal.RelationContainer implement =
      new jedd.internal.RelationContainer(new jedd.Attribute[] { subt.v(), supt.v() },
                                          new jedd.PhysicalDomain[] { T1.v(), T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.subt:soot.jimple.padd" +
                                           "le.bdddomains.T1, soot.jimple.paddle.bdddomains.supt:soot.ji" +
                                           "mple.paddle.bdddomains.T2> implement = jedd.internal.Jedd.v(" +
                                           ").falseBDD() at /home/research/ccl/olhota/soot-trunk2/src/so" +
                                           "ot/jimple/paddle/BDDHierarchy.jedd:68,12-30"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    private final jedd.internal.RelationContainer array =
      new jedd.internal.RelationContainer(new jedd.Attribute[] { subt.v(), supt.v() },
                                          new jedd.PhysicalDomain[] { T1.v(), T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.subt:soot.jimple.padd" +
                                           "le.bdddomains.T1, soot.jimple.paddle.bdddomains.supt:soot.ji" +
                                           "mple.paddle.bdddomains.T2> array = jedd.internal.Jedd.v().fa" +
                                           "lseBDD() at /home/research/ccl/olhota/soot-trunk2/src/soot/j" +
                                           "imple/paddle/BDDHierarchy.jedd:76,12-30"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    public jedd.internal.RelationContainer array() {
        return new jedd.internal.RelationContainer(new jedd.Attribute[] { supt.v(), subt.v() },
                                                   new jedd.PhysicalDomain[] { T2.v(), T1.v() },
                                                   ("return array; at /home/research/ccl/olhota/soot-trunk2/src/s" +
                                                    "oot/jimple/paddle/BDDHierarchy.jedd:77,34-40"),
                                                   array);
    }
    
    private final jedd.internal.RelationContainer arrayElem =
      new jedd.internal.RelationContainer(new jedd.Attribute[] { arrayt.v(), elemt.v() },
                                          new jedd.PhysicalDomain[] { T3.v(), T1.v() },
                                          ("private <soot.jimple.paddle.bdddomains.arrayt:soot.jimple.pa" +
                                           "ddle.bdddomains.T3, soot.jimple.paddle.bdddomains.elemt> arr" +
                                           "ayElem = jedd.internal.Jedd.v().falseBDD() at /home/research" +
                                           "/ccl/olhota/soot-trunk2/src/soot/jimple/paddle/BDDHierarchy." +
                                           "jedd:79,12-30"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    private final jedd.internal.RelationContainer anySub =
      new jedd.internal.RelationContainer(new jedd.Attribute[] { anyst.v(), type.v() },
                                          new jedd.PhysicalDomain[] { T1.v(), T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.anyst:soot.jimple.pad" +
                                           "dle.bdddomains.T1, soot.jimple.paddle.bdddomains.type:soot.j" +
                                           "imple.paddle.bdddomains.T2> anySub = jedd.internal.Jedd.v()." +
                                           "falseBDD() at /home/research/ccl/olhota/soot-trunk2/src/soot" +
                                           "/jimple/paddle/BDDHierarchy.jedd:84,12-31"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    public jedd.internal.RelationContainer anySub() {
        return new jedd.internal.RelationContainer(new jedd.Attribute[] { type.v(), anyst.v() },
                                                   new jedd.PhysicalDomain[] { T2.v(), T1.v() },
                                                   ("return anySub; at /home/research/ccl/olhota/soot-trunk2/src/" +
                                                    "soot/jimple/paddle/BDDHierarchy.jedd:85,36-42"),
                                                   anySub);
    }
    
    private final jedd.internal.RelationContainer oldAnySub =
      new jedd.internal.RelationContainer(new jedd.Attribute[] { anyst.v(), type.v() },
                                          new jedd.PhysicalDomain[] { T1.v(), T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.anyst, soot.jimple.pa" +
                                           "ddle.bdddomains.type> oldAnySub = jedd.internal.Jedd.v().fal" +
                                           "seBDD() at /home/research/ccl/olhota/soot-trunk2/src/soot/ji" +
                                           "mple/paddle/BDDHierarchy.jedd:86,12-25"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    private final jedd.internal.RelationContainer nullType =
      new jedd.internal.RelationContainer(new jedd.Attribute[] { subt.v(), supt.v() },
                                          new jedd.PhysicalDomain[] { T1.v(), T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.subt, soot.jimple.pad" +
                                           "dle.bdddomains.supt> nullType = jedd.internal.Jedd.v().false" +
                                           "BDD() at /home/research/ccl/olhota/soot-trunk2/src/soot/jimp" +
                                           "le/paddle/BDDHierarchy.jedd:89,12-24"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    private final jedd.internal.RelationContainer closure =
      new jedd.internal.RelationContainer(new jedd.Attribute[] { subt.v(), supt.v() },
                                          new jedd.PhysicalDomain[] { T1.v(), T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.subt:soot.jimple.padd" +
                                           "le.bdddomains.T1, soot.jimple.paddle.bdddomains.supt:soot.ji" +
                                           "mple.paddle.bdddomains.T2> closure = jedd.internal.Jedd.v()." +
                                           "falseBDD() at /home/research/ccl/olhota/soot-trunk2/src/soot" +
                                           "/jimple/paddle/BDDHierarchy.jedd:94,12-30"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    private final jedd.internal.RelationContainer concreteNonArray =
      new jedd.internal.RelationContainer(new jedd.Attribute[] { type.v() },
                                          new jedd.PhysicalDomain[] { T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.type> concreteNonArra" +
                                           "y = jedd.internal.Jedd.v().falseBDD() at /home/research/ccl/" +
                                           "olhota/soot-trunk2/src/soot/jimple/paddle/BDDHierarchy.jedd:" +
                                           "96,12-18"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    private final jedd.internal.RelationContainer concrete =
      new jedd.internal.RelationContainer(new jedd.Attribute[] { type.v() },
                                          new jedd.PhysicalDomain[] { T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.type> concrete = jedd" +
                                           ".internal.Jedd.v().falseBDD() at /home/research/ccl/olhota/s" +
                                           "oot-trunk2/src/soot/jimple/paddle/BDDHierarchy.jedd:97,12-18"),
                                          jedd.internal.Jedd.v().falseBDD());
    
    public jedd.internal.RelationContainer concrete() {
        updateTypes();
        return new jedd.internal.RelationContainer(new jedd.Attribute[] { type.v() },
                                                   new jedd.PhysicalDomain[] { T2.v() },
                                                   ("return concrete; at /home/research/ccl/olhota/soot-trunk2/sr" +
                                                    "c/soot/jimple/paddle/BDDHierarchy.jedd:100,8-14"),
                                                   concrete);
    }
    
    private RefType jlo = RefType.v("java.lang.Object");
    
    private RefType jis = RefType.v("java.io.Serializable");
    
    private RefType jlc = RefType.v("java.lang.Cloneable");
    
    private Type array(int dimensions, Type base) {
        Type ret;
        if (dimensions == 0) ret = base; else ret = ArrayType.v(base, dimensions);
        Scene.v().getTypeNumberer().add(ret);
        return ret;
    }
    
    private int maxType = 0;
    
    private void processNewType(Type t) {
        if (t instanceof RefType) {
            RefType rt = (RefType) t;
            SootClass sc = rt.getSootClass();
            if (sc == null) return;
            identity.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { rt, rt },
                                                            new jedd.Attribute[] { subt.v(), supt.v() },
                                                            new jedd.PhysicalDomain[] { T1.v(), T2.v() }));
            if (sc.hasSuperclass()) {
                extend.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { rt, sc.getSuperclass().getType() },
                                                              new jedd.Attribute[] { subt.v(), supt.v() },
                                                              new jedd.PhysicalDomain[] { T1.v(), T2.v() }));
            }
            for (Iterator ifaceIt = sc.getInterfaces().iterator(); ifaceIt.hasNext(); ) {
                final SootClass iface = (SootClass) ifaceIt.next();
                implement.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { rt, iface.getType() },
                                                                 new jedd.Attribute[] { subt.v(), supt.v() },
                                                                 new jedd.PhysicalDomain[] { T1.v(), T2.v() }));
            }
            if (sc.isConcrete()) {
                concrete.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { rt },
                                                                new jedd.Attribute[] { type.v() },
                                                                new jedd.PhysicalDomain[] { T2.v() }));
                concreteNonArray.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { rt },
                                                                        new jedd.Attribute[] { type.v() },
                                                                        new jedd.PhysicalDomain[] { T2.v() }));
            }
        } else
            if (t instanceof ArrayType) {
                identity.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { t, t },
                                                                new jedd.Attribute[] { subt.v(), supt.v() },
                                                                new jedd.PhysicalDomain[] { T1.v(), T2.v() }));
                ArrayType at = (ArrayType) t;
                if (at.baseType instanceof PrimType) {
                    array.eqUnion(jedd.internal.Jedd.v().union(jedd.internal.Jedd.v().read(jedd.internal.Jedd.v().union(jedd.internal.Jedd.v().read(jedd.internal.Jedd.v().literal(new Object[] { at, array(at.numDimensions -
                                                                                                                                                                                                              1,
                                                                                                                                                                                                            jlo) },
                                                                                                                                                                                   new jedd.Attribute[] { subt.v(), supt.v() },
                                                                                                                                                                                   new jedd.PhysicalDomain[] { T1.v(), T2.v() })),
                                                                                                                        jedd.internal.Jedd.v().literal(new Object[] { at, array(at.numDimensions -
                                                                                                                                                                                  1,
                                                                                                                                                                                jis) },
                                                                                                                                                       new jedd.Attribute[] { subt.v(), supt.v() },
                                                                                                                                                       new jedd.PhysicalDomain[] { T1.v(), T2.v() }))),
                                                               jedd.internal.Jedd.v().literal(new Object[] { at, array(at.numDimensions -
                                                                                                                         1,
                                                                                                                       jlc) },
                                                                                              new jedd.Attribute[] { subt.v(), supt.v() },
                                                                                              new jedd.PhysicalDomain[] { T1.v(), T2.v() })));
                } else
                    if (at.baseType instanceof RefType) {
                        RefType rt = (RefType) at.baseType;
                        if (rt.equals(jlo)) {
                            array.eqUnion(jedd.internal.Jedd.v().union(jedd.internal.Jedd.v().read(jedd.internal.Jedd.v().union(jedd.internal.Jedd.v().read(jedd.internal.Jedd.v().literal(new Object[] { at, array(at.numDimensions -
                                                                                                                                                                                                                      1,
                                                                                                                                                                                                                    jlo) },
                                                                                                                                                                                           new jedd.Attribute[] { subt.v(), supt.v() },
                                                                                                                                                                                           new jedd.PhysicalDomain[] { T1.v(), T2.v() })),
                                                                                                                                jedd.internal.Jedd.v().literal(new Object[] { at, array(at.numDimensions -
                                                                                                                                                                                          1,
                                                                                                                                                                                        jis) },
                                                                                                                                                               new jedd.Attribute[] { subt.v(), supt.v() },
                                                                                                                                                               new jedd.PhysicalDomain[] { T1.v(), T2.v() }))),
                                                                       jedd.internal.Jedd.v().literal(new Object[] { at, array(at.numDimensions -
                                                                                                                                 1,
                                                                                                                               jlc) },
                                                                                                      new jedd.Attribute[] { subt.v(), supt.v() },
                                                                                                      new jedd.PhysicalDomain[] { T1.v(), T2.v() })));
                        } else {
                            array.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { at, array(at.numDimensions,
                                                                                                  jlo) },
                                                                         new jedd.Attribute[] { subt.v(), supt.v() },
                                                                         new jedd.PhysicalDomain[] { T1.v(), T2.v() }));
                        }
                    } else
                        throw new RuntimeException("unhandled: " + at.baseType);
                arrayElem.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { at, at.getArrayElementType() },
                                                                 new jedd.Attribute[] { arrayt.v(), elemt.v() },
                                                                 new jedd.PhysicalDomain[] { T3.v(), T1.v() }));
                concrete.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { at },
                                                                new jedd.Attribute[] { type.v() },
                                                                new jedd.PhysicalDomain[] { T2.v() }));
            } else
                if (t instanceof AnySubType) {
                    AnySubType as = (AnySubType) t;
                    anySub.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { as, as.getBase() },
                                                                  new jedd.Attribute[] { anyst.v(), type.v() },
                                                                  new jedd.PhysicalDomain[] { T1.v(), T2.v() }));
                    anySub.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { as, NullType.v() },
                                                                  new jedd.Attribute[] { anyst.v(), type.v() },
                                                                  new jedd.PhysicalDomain[] { T1.v(), T2.v() }));
                } else
                    if (t instanceof NullType) {
                        identity.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { t, t },
                                                                        new jedd.Attribute[] { subt.v(), supt.v() },
                                                                        new jedd.PhysicalDomain[] { T1.v(), T2.v() }));
                    }
        nullType.eqUnion(jedd.internal.Jedd.v().literal(new Object[] { NullType.v(), t },
                                                        new jedd.Attribute[] { subt.v(), supt.v() },
                                                        new jedd.PhysicalDomain[] { T1.v(), T2.v() }));
        if (t.getNumber() > maxType) maxType = t.getNumber();
    }
    
    private void updateClosure() {
        boolean closureChanged =
          !jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(closure),
                                         closure.eqUnion(jedd.internal.Jedd.v().union(jedd.internal.Jedd.v().read(jedd.internal.Jedd.v().union(jedd.internal.Jedd.v().read(jedd.internal.Jedd.v().union(jedd.internal.Jedd.v().read(jedd.internal.Jedd.v().union(jedd.internal.Jedd.v().read(extend),
                                                                                                                                                                                                                                                                 implement)),
                                                                                                                                                                                                        array)),
                                                                                                                                               identity)),
                                                                                      nullType)));
        if (closureChanged)
            while (!jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(closure),
                                                  closure.eqUnion(jedd.internal.Jedd.v().replace(jedd.internal.Jedd.v().compose(jedd.internal.Jedd.v().read(closure),
                                                                                                                                jedd.internal.Jedd.v().replace(closure,
                                                                                                                                                               new jedd.PhysicalDomain[] { T2.v(), T1.v() },
                                                                                                                                                               new jedd.PhysicalDomain[] { T1.v(), T3.v() }),
                                                                                                                                new jedd.PhysicalDomain[] { T1.v() }),
                                                                                                 new jedd.PhysicalDomain[] { T3.v() },
                                                                                                 new jedd.PhysicalDomain[] { T1.v() }))))
                ;
        if (!jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(anySub), oldAnySub) || closureChanged) {
            anySub.eqUnion(jedd.internal.Jedd.v().compose(jedd.internal.Jedd.v().read(jedd.internal.Jedd.v().replace(anySub,
                                                                                                                     new jedd.PhysicalDomain[] { T2.v() },
                                                                                                                     new jedd.PhysicalDomain[] { T3.v() })),
                                                          jedd.internal.Jedd.v().replace(closure,
                                                                                         new jedd.PhysicalDomain[] { T2.v(), T1.v() },
                                                                                         new jedd.PhysicalDomain[] { T3.v(), T2.v() }),
                                                          new jedd.PhysicalDomain[] { T3.v() }));
            anySub.eq(jedd.internal.Jedd.v().join(jedd.internal.Jedd.v().read(anySub),
                                                  concreteNonArray,
                                                  new jedd.PhysicalDomain[] { T2.v() }));
            closure.eqUnion(jedd.internal.Jedd.v().replace(jedd.internal.Jedd.v().compose(jedd.internal.Jedd.v().read(anySub),
                                                                                          jedd.internal.Jedd.v().replace(jedd.internal.Jedd.v().replace(closure,
                                                                                                                                                        new jedd.PhysicalDomain[] { T2.v() },
                                                                                                                                                        new jedd.PhysicalDomain[] { T3.v() }),
                                                                                                                         new jedd.PhysicalDomain[] { T1.v() },
                                                                                                                         new jedd.PhysicalDomain[] { T2.v() }),
                                                                                          new jedd.PhysicalDomain[] { T2.v() }),
                                                           new jedd.PhysicalDomain[] { T3.v() },
                                                           new jedd.PhysicalDomain[] { T2.v() }));
        }
        oldAnySub.eq(anySub);
        while (!jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(closure),
                                              closure.eqUnion(jedd.internal.Jedd.v().replace(jedd.internal.Jedd.v().compose(jedd.internal.Jedd.v().read(jedd.internal.Jedd.v().replace(jedd.internal.Jedd.v().compose(jedd.internal.Jedd.v().read(closure),
                                                                                                                                                                                                                      arrayElem,
                                                                                                                                                                                                                      new jedd.PhysicalDomain[] { T1.v() }),
                                                                                                                                                                                       new jedd.PhysicalDomain[] { T3.v() },
                                                                                                                                                                                       new jedd.PhysicalDomain[] { T1.v() })),
                                                                                                                            jedd.internal.Jedd.v().replace(arrayElem,
                                                                                                                                                           new jedd.PhysicalDomain[] { T1.v() },
                                                                                                                                                           new jedd.PhysicalDomain[] { T2.v() }),
                                                                                                                            new jedd.PhysicalDomain[] { T2.v() }),
                                                                                             new jedd.PhysicalDomain[] { T3.v() },
                                                                                             new jedd.PhysicalDomain[] { T2.v() }))))
            ;
    }
    
    public BDDHierarchy() { super(); }
}