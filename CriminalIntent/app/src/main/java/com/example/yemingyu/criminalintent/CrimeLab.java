package com.example.yemingyu.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by yemingyu on 03/07/2017.
 */

public class CrimeLab {

    private static CrimeLab sCtimeLab;

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (null == sCtimeLab) {
            sCtimeLab = new CrimeLab(context);
        }
        return sCtimeLab;
    }

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            Crime crime = new Crime();
//            crime.setTitle("Crime #" + i);
//            crime.setSolved(i % 2 == 0);
//            mCrimes.add(crime);
//        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime: mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
