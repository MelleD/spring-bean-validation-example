package com.example.demo;

/**
 * Class is generated
 */
public class Foo {

   private final String foo;

   public Foo( final String foo ) {
      if ( foo.length() < 4 ) {
         throw new IllegalArgumentException( "Foo have to be a lenght >= 4" );
      }
      this.foo = foo;
   }
}