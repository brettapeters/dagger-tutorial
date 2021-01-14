package com.example.atm;

import dagger.Binds;
import dagger.Module;

@Module
abstract class HelloWorldModule {

  @Binds
  abstract Command helloWorldCommand(HelloWorldCommand command);
}
