package com.example.demo;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.core.convert.converter.Converter;

public class TestConverter implements Converter<String, Foo> {

   @Override
   // TODO Need @NotNull @NotEmpty and a custom url
   public Foo convert( final String source ) {
      @Valid final InnerValue innerValue = new InnerValue( source );

      convertAndValid( innerValue );

      convertPlain( source );

      convertFoo( source );

      return new Foo( innerValue.getUrl() );
   }

   @Valid
   public InnerValue convertAndValid( @Valid final InnerValue source ) {
      return source;
   }

   @Valid
   public String convertPlain( @NotNull @NotEmpty final String source ) {
      return source;
   }

   @Valid
   public Foo convertFoo( @NotNull @NotEmpty final String source ) {
      return new Foo( source );
   }

   public class InnerValue {

      @NotNull
      @NotEmpty
      private final String url;

      public InnerValue( final String url ) {
         this.url = url;
      }

      public String getUrl() {
         return url;
      }
   }

}
