package com.example.blogproject;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.blogproject.Models.User;

public class BlogVIewModel extends AndroidViewModel {

    public BlogDao BlogDao;
    public BlogRoomDatabase BlogDb;
    public BlogVIewModel(@NonNull Application application) {
        super(application);

        BlogDb = BlogRoomDatabase.getDatabase(application);
        BlogDao = BlogDb.BlogDao();

    }

    public void insert(User user){
        new InsertAsyncTask(BlogDao).execute(user);
    }

    private class InsertAsyncTask extends AsyncTask<User,Void,Void> {

        private BlogDao mBlogDao;

        public InsertAsyncTask(BlogDao blogDao) {
            this.mBlogDao = blogDao;
        }

        /**
         * Override this method to perform a computation on a background thread. The
         * specified parameters are the parameters passed to {@link #execute}
         * by the caller of this task.
         * <p>
         * This will normally run on a background thread. But to better
         * support testing frameworks, it is recommended that this also tolerates
         * direct execution on the foreground thread, as part of the {@link #execute} call.
         * <p>
         * This method can call {@link #publishProgress} to publish updates
         * on the UI thread.
         *
         * @param User The parameters of the task.
         * @return A result, defined by the subclass of this task.
         * @see #onPreExecute()
         * @see #onPostExecute
         * @see #publishProgress
         */
        @Override
        protected Void doInBackground(User... user) {
            BlogDao.insert(user[0]);
            Log.d("insertion","Value inserted");
            return null;
        }
    }






}


