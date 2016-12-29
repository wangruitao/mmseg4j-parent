package com.chenlb.mmseg4j.analysis;

import java.io.File;

import com.chenlb.mmseg4j.Dictionary;
import com.chenlb.mmseg4j.Seg;
import com.chenlb.mmseg4j.SimpleSeg;

/**
 * mmseg 的 simple anlayzer.
 * 
 */
public class SimpleAnalyzer extends MMSegAnalyzer {
	
	public SimpleAnalyzer() {
		super();
	}
	
	public SimpleAnalyzer(String path) {
		super(path);
	}
	
	public SimpleAnalyzer(Dictionary dic) {
		super(dic);
	}

	public SimpleAnalyzer(File path) {
		super(path);
	}

	protected Seg newSeg() {
		return new SimpleSeg(dic);
	}
}
