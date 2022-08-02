package com.dio.apprepositories.domain

import com.dio.apprepositories.core.UseCase
import com.dio.apprepositories.data.model.Repo
import com.dio.apprepositories.data.repositories.RepoRepository
import com.dio.apprepositories.data.services.GitHubService
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
):
    UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}