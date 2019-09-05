package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.lang.Class;
import java.lang.Cloneable;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.SafeVarargs;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.URL;

/**
 * Contains all public methods from {@link RequestBuilder<TranscodeType>}, all options from
 * {@link RequestOptions} and all generated options from
 * {@link com.bumptech.glide.annotation.GlideOption} in annotated methods in
 * {@link com.bumptech.glide.annotation.GlideExtension} annotated classes.
 *
 * <p>Generated code, do not modify.
 *
 * @see RequestBuilder<TranscodeType>
 * @see RequestOptions
 */
@SuppressWarnings({
    "unused",
    "deprecation"
})
public class GlideRequest<TranscodeType> extends RequestBuilder<TranscodeType> implements Cloneable {
  GlideRequest(@NonNull Class<TranscodeType> transcodeClass, @NonNull RequestBuilder<?> other) {
    super(transcodeClass, other);
  }

  GlideRequest(@NonNull Glide glide, @NonNull RequestManager requestManager,
      @NonNull Class<TranscodeType> transcodeClass, @NonNull Context context) {
    super(glide, requestManager ,transcodeClass, context);
  }

  @Override
  @CheckResult
  @NonNull
  protected GlideRequest<File> getDownloadOnlyRequest() {
    return new GlideRequest<>(File.class, this).apply(DOWNLOAD_ONLY_OPTIONS);
  }

  /**
   * @see GlideOptions#sizeMultiplier(float)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> sizeMultiplier(@FloatRange(from = 0.0, to = 1.0) float value) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).sizeMultiplier(value);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).sizeMultiplier(value);
    }
    return this;
  }

  /**
   * @see GlideOptions#useUnlimitedSourceGeneratorsPool(boolean)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean flag) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).useUnlimitedSourceGeneratorsPool(flag);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).useUnlimitedSourceGeneratorsPool(flag);
    }
    return this;
  }

  /**
   * @see GlideOptions#useAnimationPool(boolean)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> useAnimationPool(boolean flag) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).useAnimationPool(flag);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).useAnimationPool(flag);
    }
    return this;
  }

  /**
   * @see GlideOptions#onlyRetrieveFromCache(boolean)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean flag) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).onlyRetrieveFromCache(flag);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).onlyRetrieveFromCache(flag);
    }
    return this;
  }

  /**
   * @see GlideOptions#diskCacheStrategy(DiskCacheStrategy)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> diskCacheStrategy(@androidx.annotation.NonNull DiskCacheStrategy strategy) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).diskCacheStrategy(strategy);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).diskCacheStrategy(strategy);
    }
    return this;
  }

  /**
   * @see GlideOptions#priority(Priority)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> priority(@androidx.annotation.NonNull Priority priority) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).priority(priority);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).priority(priority);
    }
    return this;
  }

  /**
   * @see GlideOptions#placeholder(Drawable)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> placeholder(@Nullable Drawable drawable) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).placeholder(drawable);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).placeholder(drawable);
    }
    return this;
  }

  /**
   * @see GlideOptions#placeholder(int)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> placeholder(@DrawableRes int id) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).placeholder(id);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).placeholder(id);
    }
    return this;
  }

  /**
   * @see GlideOptions#fallback(Drawable)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> fallback(@Nullable Drawable drawable) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).fallback(drawable);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).fallback(drawable);
    }
    return this;
  }

  /**
   * @see GlideOptions#fallback(int)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> fallback(@DrawableRes int id) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).fallback(id);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).fallback(id);
    }
    return this;
  }

  /**
   * @see GlideOptions#error(Drawable)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> error(@Nullable Drawable drawable) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).error(drawable);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).error(drawable);
    }
    return this;
  }

  /**
   * @see GlideOptions#error(int)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> error(@DrawableRes int id) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).error(id);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).error(id);
    }
    return this;
  }

  /**
   * @see GlideOptions#theme(Resources.Theme)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> theme(@Nullable Resources.Theme theme) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).theme(theme);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).theme(theme);
    }
    return this;
  }

  /**
   * @see GlideOptions#skipMemoryCache(boolean)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> skipMemoryCache(boolean skip) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).skipMemoryCache(skip);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).skipMemoryCache(skip);
    }
    return this;
  }

  /**
   * @see GlideOptions#override(int, int)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> override(int width, int height) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).override(width, height);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).override(width, height);
    }
    return this;
  }

  /**
   * @see GlideOptions#override(int)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> override(int size) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).override(size);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).override(size);
    }
    return this;
  }

  /**
   * @see GlideOptions#signature(Key)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> signature(@androidx.annotation.NonNull Key key) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).signature(key);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).signature(key);
    }
    return this;
  }

  /**
   * @see GlideOptions#set(Option<T>, T)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public <T> GlideRequest<TranscodeType> set(@androidx.annotation.NonNull Option<T> option,
      @androidx.annotation.NonNull T t) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).set(option, t);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).set(option, t);
    }
    return this;
  }

  /**
   * @see GlideOptions#decode(Class<?>)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> decode(@androidx.annotation.NonNull Class<?> clazz) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).decode(clazz);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).decode(clazz);
    }
    return this;
  }

  /**
   * @see GlideOptions#encodeFormat(Bitmap.CompressFormat)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> encodeFormat(@androidx.annotation.NonNull Bitmap.CompressFormat format) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).encodeFormat(format);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).encodeFormat(format);
    }
    return this;
  }

  /**
   * @see GlideOptions#encodeQuality(int)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> encodeQuality(@IntRange(from = 0, to = 100) int value) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).encodeQuality(value);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).encodeQuality(value);
    }
    return this;
  }

  /**
   * @see GlideOptions#frame(long)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> frame(@IntRange(from = 0) long value) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).frame(value);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).frame(value);
    }
    return this;
  }

  /**
   * @see GlideOptions#format(DecodeFormat)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> format(@androidx.annotation.NonNull DecodeFormat format) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).format(format);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).format(format);
    }
    return this;
  }

  /**
   * @see GlideOptions#disallowHardwareConfig()
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> disallowHardwareConfig() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).disallowHardwareConfig();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).disallowHardwareConfig();
    }
    return this;
  }

  /**
   * @see GlideOptions#downsample(DownsampleStrategy)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> downsample(@androidx.annotation.NonNull DownsampleStrategy strategy) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).downsample(strategy);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).downsample(strategy);
    }
    return this;
  }

  /**
   * @see GlideOptions#timeout(int)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> timeout(@IntRange(from = 0) int value) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).timeout(value);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).timeout(value);
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalCenterCrop()
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> optionalCenterCrop() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalCenterCrop();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalCenterCrop();
    }
    return this;
  }

  /**
   * @see GlideOptions#centerCrop()
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> centerCrop() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).centerCrop();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).centerCrop();
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalFitCenter()
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> optionalFitCenter() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalFitCenter();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalFitCenter();
    }
    return this;
  }

  /**
   * @see GlideOptions#fitCenter()
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> fitCenter() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).fitCenter();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).fitCenter();
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalCenterInside()
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> optionalCenterInside() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalCenterInside();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalCenterInside();
    }
    return this;
  }

  /**
   * @see GlideOptions#centerInside()
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> centerInside() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).centerInside();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).centerInside();
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalCircleCrop()
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> optionalCircleCrop() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalCircleCrop();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalCircleCrop();
    }
    return this;
  }

  /**
   * @see GlideOptions#circleCrop()
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> circleCrop() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).circleCrop();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).circleCrop();
    }
    return this;
  }

  /**
   * @see GlideOptions#transform(Transformation<Bitmap>)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> transform(@androidx.annotation.NonNull Transformation<Bitmap> transformation) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).transform(transformation);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).transform(transformation);
    }
    return this;
  }

  /**
   * @see GlideOptions#transforms(Transformation<Bitmap>[])
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  @SuppressWarnings({
      "unchecked",
      "varargs"
  })
  public GlideRequest<TranscodeType> transforms(@androidx.annotation.NonNull Transformation<Bitmap>... transformations) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).transforms(transformations);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).transforms(transformations);
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalTransform(Transformation<Bitmap>)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> optionalTransform(@androidx.annotation.NonNull Transformation<Bitmap> transformation) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalTransform(transformation);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalTransform(transformation);
    }
    return this;
  }

  /**
   * @see GlideOptions#optionalTransform(Class<T>, Transformation<T>)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public <T> GlideRequest<TranscodeType> optionalTransform(@androidx.annotation.NonNull Class<T> clazz,
      @androidx.annotation.NonNull Transformation<T> transformation) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).optionalTransform(clazz, transformation);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalTransform(clazz, transformation);
    }
    return this;
  }

  /**
   * @see GlideOptions#transform(Class<T>, Transformation<T>)
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public <T> GlideRequest<TranscodeType> transform(@androidx.annotation.NonNull Class<T> clazz,
      @androidx.annotation.NonNull Transformation<T> transformation) {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).transform(clazz, transformation);
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).transform(clazz, transformation);
    }
    return this;
  }

  /**
   * @see GlideOptions#dontTransform()
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> dontTransform() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).dontTransform();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).dontTransform();
    }
    return this;
  }

  /**
   * @see GlideOptions#dontAnimate()
   */
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> dontAnimate() {
    if (getMutableOptions() instanceof GlideOptions) {
      this.requestOptions = ((GlideOptions) getMutableOptions()).dontAnimate();
    } else {
      this.requestOptions = new GlideOptions().apply(this.requestOptions).dontAnimate();
    }
    return this;
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> apply(@androidx.annotation.NonNull RequestOptions options) {
    return (GlideRequest<TranscodeType>) super.apply(options);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> transition(@androidx.annotation.NonNull TransitionOptions<?, ? super TranscodeType> options) {
    return (GlideRequest<TranscodeType>) super.transition(options);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> listener(@Nullable RequestListener<TranscodeType> listener) {
    return (GlideRequest<TranscodeType>) super.listener(listener);
  }

  @Override
  @androidx.annotation.NonNull
  public GlideRequest<TranscodeType> error(@Nullable RequestBuilder<TranscodeType> builder) {
    return (GlideRequest<TranscodeType>) super.error(builder);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType> builder) {
    return (GlideRequest<TranscodeType>) super.thumbnail(builder);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  @SafeVarargs
  @SuppressWarnings("varargs")
  public final GlideRequest<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType>... builders) {
    return (GlideRequest<TranscodeType>) super.thumbnail(builders);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> thumbnail(float sizeMultiplier) {
    return (GlideRequest<TranscodeType>) super.thumbnail(sizeMultiplier);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable Object o) {
    return (GlideRequest<TranscodeType>) super.load(o);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable Bitmap bitmap) {
    return (GlideRequest<TranscodeType>) super.load(bitmap);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable Drawable drawable) {
    return (GlideRequest<TranscodeType>) super.load(drawable);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable String string) {
    return (GlideRequest<TranscodeType>) super.load(string);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable Uri uri) {
    return (GlideRequest<TranscodeType>) super.load(uri);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable File file) {
    return (GlideRequest<TranscodeType>) super.load(file);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@RawRes @DrawableRes @Nullable Integer id) {
    return (GlideRequest<TranscodeType>) super.load(id);
  }

  @Override
  @Deprecated
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable URL url) {
    return (GlideRequest<TranscodeType>) super.load(url);
  }

  @Override
  @androidx.annotation.NonNull
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> load(@Nullable byte[] bytes) {
    return (GlideRequest<TranscodeType>) super.load(bytes);
  }

  @Override
  @androidx.annotation.CheckResult
  public GlideRequest<TranscodeType> clone() {
    return (GlideRequest<TranscodeType>) super.clone();
  }
}
