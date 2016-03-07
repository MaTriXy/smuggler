package io.mironov.smuggler.compiler.annotations

import org.objectweb.asm.Type

@AnnotationDelegate("io.mironov.smuggler.GlobalAdapter")
interface GlobalAdapter

@AnnotationDelegate("io.mironov.smuggler.LocalAdapter")
interface LocalAdapter {
  fun value(): Array<Type>
}

@AnnotationDelegate("io.mironov.smuggler.AdaptedType")
interface AdaptedType {
  fun value(): Type
}
