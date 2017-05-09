package cn.edu.pku.app.familylibrary.adapter;

import android.support.annotation.NonNull;

import java.util.List;

import cn.edu.pku.app.familylibrary.R;
import cn.edu.pku.app.familylibrary.base.recyclerview.BaseViewHolder;
import cn.edu.pku.app.familylibrary.base.recyclerview.RecyclerBaseAdapter;
import cn.edu.pku.app.familylibrary.model.Book;

/**
 * Created by jeanboy on 2017/5/8.
 */

public class BookListAdapter extends RecyclerBaseAdapter<Book> {


    public BookListAdapter(@NonNull List<Book> dataList) {
        super(dataList, R.layout.item_book_list);
    }

    @Override
    public void convert(BaseViewHolder holder, Book book, final int position) {

    }
}
