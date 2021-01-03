//
// Created by yakubov on 03-Jan-21.
//

#include<jni.h>
#include <string>

extern "C" {

jstring Java_com_example_candroid_MainActivity_sayHi(JNIEnv * env, jobject) {
    std::string hello = "hello world from cpp";
    return env->NewStringUTF(hello.c_str());
}

}