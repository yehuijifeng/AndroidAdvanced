package com.lh.component.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import com.lh.base.BaseFragment
import com.lh.component.R


/**
 * user：LuHao
 * time：2020/9/11 19:57
 * describe：组件化功能展示
 */
class ComponentFragment : BaseFragment() {
    @Nullable
    override fun onCreateView(
        inflater: LayoutInflater,
        @Nullable container: ViewGroup?,
        @Nullable savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_component, container, false)
    }
}