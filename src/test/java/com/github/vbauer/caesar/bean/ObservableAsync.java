package com.github.vbauer.caesar.bean;

import com.github.vbauer.caesar.annotation.Timeout;
import rx.Observable;

/**
 * @author Vladislav Bauer
 */

public interface ObservableAsync {

    Observable<String> hello(String name1, String name2);

    Observable<String> hello(String name);

    Observable<Void> emptyHello(String name);

    Observable<Void> empty();

    Observable<Void> exception();

    Observable<Boolean> methodWithoutSyncImpl();

    @Timeout(1)
    Observable<Boolean> timeout();

}
