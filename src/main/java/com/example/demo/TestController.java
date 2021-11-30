package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestApi {

   @Autowired
   private ConversionService conversionService;

   @Override
   public ResponseEntity<Foo> test( final String source ) {
      final Foo foo = conversionService.convert( "", Foo.class );
      return ResponseEntity.ok( foo );
   }

}
