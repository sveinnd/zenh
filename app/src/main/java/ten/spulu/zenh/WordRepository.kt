package ten.spulu.zenh

import androidx.lifecycle.LiveData

class WordRepository(private val wordDao : WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}
