package io.mironov.smuggler.compiler.annotations

import kotlin.reflect.KClass

@AnnotationDelegate("io.mironov.smuggler.GlobalAdapter")
interface GlobalAdapter

@AnnotationDelegate("io.mironov.smuggler.ClassAdapter")
interface ClassAdapter {
  fun value(): Array<KClass<*>>
}

@AnnotationDelegate("io.mironov.smuggler.AdaptedType")
interface AdaptedType {
  fun value(): KClass<*>
}
