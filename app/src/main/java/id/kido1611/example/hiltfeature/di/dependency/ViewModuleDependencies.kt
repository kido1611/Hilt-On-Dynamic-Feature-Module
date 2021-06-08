package id.kido1611.example.hiltfeature.di.dependency

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.kido1611.example.hiltfeature.AppConfig
import id.kido1611.example.hiltfeature.credential.Credential

@EntryPoint
@InstallIn(SingletonComponent::class)
interface ViewModuleDependencies {
    fun provideCredential(): Credential
    fun provideAppConfig(): AppConfig
}