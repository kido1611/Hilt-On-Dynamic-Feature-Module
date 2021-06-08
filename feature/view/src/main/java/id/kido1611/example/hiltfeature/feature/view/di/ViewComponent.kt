package id.kido1611.example.hiltfeature.feature.view.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import id.kido1611.example.hiltfeature.di.dependency.ViewModuleDependencies
import id.kido1611.example.hiltfeature.feature.view.fragment.view.ViewFragment

@Component(
    dependencies = [
        ViewModuleDependencies::class
    ],
    modules = [
        ViewModule::class
    ]
)
interface ViewComponent {
    fun inject(fragment: ViewFragment)

    @Component.Builder
    interface Builder {
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(moduleDependencies: ViewModuleDependencies): Builder
        fun build(): ViewComponent
    }
}