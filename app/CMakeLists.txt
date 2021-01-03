cmake_minimum_required(VERSION 3.6.0)

set(NATIVE_LIB "myLibName")
add_library(${NATIVE_LIB}
        SHARED
        cpp/MyCppFile.cpp )

