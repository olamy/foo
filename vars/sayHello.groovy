#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  error("stop here")
  echo "Hello again, ${name}."  
}
