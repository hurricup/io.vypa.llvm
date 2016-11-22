package io.vypa.llvm.sdk;

import com.intellij.openapi.projectRoots.SdkType;

public class LLVMSdkTypeFactory {

    static SdkType create() {
//        if (SystemInfo.isMac) {
            return LLVMOsxSdkType.getInstance();
//        }
//        throw new UnsupportedOperationException("unsupported platform");
    }
}
