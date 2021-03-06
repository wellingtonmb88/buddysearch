package com.buddysearch.android.library.presentation.mvp.view;

import com.buddysearch.android.library.data.DataStatusMessenger;

public interface View extends DataStatusMessenger {

    void showMessage(String message);

    void showMessage(int messageResId);

    void showProgress();

    void showProgress(String message);

    void showProgress(int messageResId);

    void showProgress(String message, String title);

    void showProgress(int messageResId, int titleResId);

    void hideProgress();
}
