package ru.crypto.android.cryptomonitor.app.dagger;

import dagger.Component;
import ru.crypto.android.cryptomonitor.app.dagger.scope.PerApplication;
import ru.crypto.android.cryptomonitor.app.scheduler.SchedulerModule;
import ru.crypto.android.cryptomonitor.repository.CurrencyModule;
import ru.crypto.android.cryptomonitor.repository.common.network.NetworkModule;
import ru.crypto.android.cryptomonitor.repository.common.network.OkHttpModule;
import ru.crypto.android.cryptomonitor.repository.common.network.ServerUrlModule;

@PerApplication
@Component(modules = {
        SchedulerModule.class,
        ServerUrlModule.class,
        NetworkModule.class,
        OkHttpModule.class,
        CurrencyModule.class
})
public interface AppComponent {
}
