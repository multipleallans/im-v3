//package com.im.config;
//
//import com.im.entity.BaseEntity;
//import org.springframework.aot.hint.MemberCategory;
//import org.springframework.aot.hint.RuntimeHints;
//import org.springframework.aot.hint.RuntimeHintsRegistrar;
//
//public class DatabaseRuntimeHintsRegistrar implements RuntimeHintsRegistrar {
//
//    @Override
//    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
//        hints.reflection()
//                .registerType(BaseEntity.class, MemberCategory.DECLARED_FIELDS)
//                .registerType(
//                        BaseEntityWithGeneratedId.class, MemberCategory.DECLARED_FIELDS)
//                .registerType(
//                        EntityWithGeneratedId.class, MemberCategory.DECLARED_FIELDS);
//    }
//}
