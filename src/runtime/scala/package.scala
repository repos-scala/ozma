/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2011, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

/**
 * Core Scala types. They are always available without an explicit import.
 */
package object scala {
  type Throwable = java.lang.Throwable
  type Exception = java.lang.Exception
  type Error     = java.lang.Error

  type RuntimeException                = java.lang.RuntimeException
  type NullPointerException            = java.lang.NullPointerException
  type ClassCastException              = java.lang.ClassCastException
  type IndexOutOfBoundsException       = java.lang.IndexOutOfBoundsException
  type ArrayIndexOutOfBoundsException  = java.lang.ArrayIndexOutOfBoundsException
  type StringIndexOutOfBoundsException = java.lang.StringIndexOutOfBoundsException
  type UnsupportedOperationException   = java.lang.UnsupportedOperationException
  type IllegalArgumentException        = java.lang.IllegalArgumentException
  type NoSuchElementException          = java.util.NoSuchElementException
  type NumberFormatException           = java.lang.NumberFormatException
  type AbstractMethodError             = java.lang.AbstractMethodError

  type TraversableOnce[+A] = scala.collection.TraversableOnce[A]

  type Traversable[+A] = scala.collection.Traversable[A]
  val Traversable = scala.collection.Traversable

  type Iterable[+A] = scala.collection.Iterable[A]
  val Iterable = scala.collection.Iterable

  type Seq[+A] = scala.collection.Seq[A]
  val Seq = scala.collection.Seq

  type IndexedSeq[+A] = scala.collection.IndexedSeq[A]
  val IndexedSeq = scala.collection.IndexedSeq

  type Iterator[+A] = scala.collection.Iterator[A]
  val Iterator = scala.collection.Iterator

  type BufferedIterator[+A] = scala.collection.BufferedIterator[A]

  type List[+A] = scala.collection.immutable.List[A]
  val List = scala.collection.immutable.List

  val Nil = scala.collection.immutable.Nil

  type ::[A] = scala.collection.immutable.::[A]
  val :: = scala.collection.immutable.::

  type Stream[+A] = scala.collection.immutable.Stream[A]
  val Stream = scala.collection.immutable.Stream
  val #:: = scala.collection.immutable.Stream.#::

  type Vector[+A] = scala.collection.immutable.Vector[A]
  val Vector = scala.collection.immutable.Vector

  type StringBuilder = scala.collection.mutable.StringBuilder
  val StringBuilder = scala.collection.mutable.StringBuilder

  type Range = scala.collection.immutable.Range
  val Range = scala.collection.immutable.Range

  // Numeric types which were moved into scala.math.*

  type BigDecimal = scala.math.BigDecimal
  val BigDecimal = scala.math.BigDecimal

  type BigInt = scala.math.BigInt
  val BigInt = scala.math.BigInt

  type Equiv[T] = scala.math.Equiv[T]
  val Equiv = scala.math.Equiv

  type Fractional[T] = scala.math.Fractional[T]
  type Integral[T] = scala.math.Integral[T]

  type Numeric[T] = scala.math.Numeric[T]
  val Numeric = scala.math.Numeric

  type Ordered[T] = scala.math.Ordered[T]
  val Ordered = scala.math.Ordered

  type Ordering[T] = scala.math.Ordering[T]
  val Ordering = scala.math.Ordering

  type PartialOrdering[T] = scala.math.PartialOrdering[T]
  type PartiallyOrdered[T] = scala.math.PartiallyOrdered[T]
}