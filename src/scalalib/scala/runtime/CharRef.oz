functor

import
   ValueRef(makeValueRefClass) at 'x-ozma://root/scala/runtime/ValueRef.ozf'
   ModFunctor('module:java.lang.Character$':Module) at 'x-ozma://root/java/lang/Character.ozf'

export
   'type:scala.runtime.CharRef':Type
   'class:scala.runtime.CharRef':Class

define
   Type Class
in
   {ValueRef.makeValueRefClass "Char" false Module Type Class}
end
