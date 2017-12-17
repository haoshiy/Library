package com.yl.yhbmfw.mvp.contract;


import com.yl.library.base.mvp.APresenter;
import com.yl.library.base.mvp.IView;

/**
 * @author Yang Shihao
 */
public interface ForgetPasswordContract {

    interface View extends IView {

        String getPhone();

        String getMSMCode();

        String getPwd();

        String getConfirmPwd();

        void setBtnCodeEnable(boolean enabled);

        void setBtnCodeText(String text);
    }

    abstract class Presenter extends APresenter<View> {

        public Presenter(View view) {
            super(view);
        }

        public abstract void getCode();

        public abstract void submit();

    }
}
