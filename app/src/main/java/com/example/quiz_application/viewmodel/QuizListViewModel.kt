package com.example.quiz_application.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.quiz_application.model.QuizModel
import com.example.quiz_application.repo.FirebaseRepository
import com.firebase.ui.firestore.FirestoreRecyclerOptions

class QuizListViewModel : ViewModel() {

    private val firebaseRepo = FirebaseRepository()
    private var quizModel = QuizModel()

    fun getJoinedQuizOptions(): MutableLiveData<FirestoreRecyclerOptions<QuizModel>> {
        return firebaseRepo.getJoinedQuizOptions()
    }

    fun getMyCreatedQuizzes(): MutableLiveData<FirestoreRecyclerOptions<QuizModel>> {
        return firebaseRepo.getMyCreatedQuizzes()
    }

    // These setter and getter are for Quiz model data transfer from one fragment to another, when needed....
    fun setQuizData(quizModel: QuizModel) {
        this.quizModel = quizModel
    }
    fun getQuizData(): QuizModel {
        return quizModel
    }
}