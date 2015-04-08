package com.github.vbauer.caesar.bean;

import com.github.vbauer.caesar.annotation.Timeout;
import com.google.common.util.concurrent.ListenableFuture;

/**
 * @author Vladislav Bauer
 */

public interface ListenableFutureAsync {

    ListenableFuture<String> hello(String name1, String name2);

    ListenableFuture<String> hello(String name);

    ListenableFuture<Void> emptyHello(String name);

    ListenableFuture<Void> empty();

    ListenableFuture<Void> exception();

    ListenableFuture<Boolean> methodWithoutSyncImpl();

    @Timeout(1)
    ListenableFuture<Boolean> timeout();

}
