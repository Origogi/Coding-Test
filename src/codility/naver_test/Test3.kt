package codility.naver_test

/*
var disposable : Disposable? = null

init {
    loading.set(true)
    disposable = dataProvider
    .fetchItems()
    .subscribeOn(schedulerFacade.background)
    .observeOn(schedulerFacade.main)
    .subscribe({ list ->
        if (list.isEmpty()) {
            showNoDataAvailable.set(true)
        }

        elements.set(list)
        loading.set(false)
    }, {

        showNoDataAvailable.set(true)
        elements.set(emptyList())

        loading.set(false)
        notifyError.invoke(it)
    })
}

@override fun onCleared() {
    super.onCleared()
    if (disposable?.disposed == false) {
        disposable?.dispose()
    }
}

 */